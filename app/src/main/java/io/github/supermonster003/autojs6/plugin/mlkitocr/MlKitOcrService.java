package io.github.supermonster003.autojs6.plugin.mlkitocr;

import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.SharedMemory;
import android.util.Log;

import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions;

import org.autojs.plugin.common.api.PluginCapabilityKeys;
import org.autojs.plugin.common.api.PluginInfo;
import org.autojs.plugin.paddle.ocr.api.IOcrPlugin;
import org.autojs.plugin.paddle.ocr.api.OcrOptions;
import org.autojs.plugin.paddle.ocr.api.OcrResult;
import org.autojs.plugin.paddle.ocr.api.PaddleOcrOptionExtraKeys;
import org.autojs.plugin.paddle.ocr.api.PaddleOcrPluginCapabilityKeys;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MlKitOcrService extends Service {

    private static final String TAG = "MlKitOcrService";
    private static final String[] SUPPORTED_ABIS = {"arm64-v8a", "armeabi-v7a", "x86_64"};
    private static final long TASK_TIMEOUT_SECONDS = 60L;

    private final Object ocrLock = new Object();
    private TextRecognizer recognizer;

    private final IOcrPlugin.Stub binder = new IOcrPlugin.Stub() {
        @Override
        public PluginInfo getInfo() throws RemoteException {
            PluginInfo info = new PluginInfo();
            info.setName("ML Kit OCR (Chinese)");
            info.setDescription(getString(R.string.plugin_description));
            info.setAuthor(getString(R.string.plugin_author));
            info.setId(getString(R.string.plugin_id));
            info.setEngine(getString(R.string.plugin_engine));
            info.setVariant(getString(R.string.plugin_variant));
            info.setVersionName(BuildConfig.VERSION_NAME);
            info.setVersionCode(BuildConfig.VERSION_CODE);
            info.setVersionDate(BuildConfig.VERSION_DATE);
            info.setSupportedAbis(SUPPORTED_ABIS);

            Bundle capabilities = new Bundle();
            capabilities.putInt(PluginCapabilityKeys.REQUIRES_HOST_VERSION, 3923);
            capabilities.putBoolean(PaddleOcrPluginCapabilityKeys.SUPPORTS_RAW_IMAGE, true);
            capabilities.putString("modelProfile", "chinese");
            capabilities.putBoolean("supportsTextDetection", true);
            capabilities.putBoolean("supportsTextRecognition", true);
            capabilities.putBoolean("supportsTextLineOrientationClassification", false);
            info.setCapabilities(capabilities);
            return info;
        }

        @Override
        public List<String> recognizeText(ParcelFileDescriptor image, OcrOptions options) throws RemoteException {
            List<String> texts = new ArrayList<>();
            for (OcrResult result : detect(image, options)) {
                texts.add(result.text == null ? "" : result.text);
            }
            return texts;
        }

        @Override
        public List<OcrResult> detect(ParcelFileDescriptor image, OcrOptions options) throws RemoteException {
            synchronized (ocrLock) {
                Bitmap bitmap = decodeImage(image, options);
                try {
                    Text text = Tasks.await(
                            getRecognizer().process(InputImage.fromBitmap(bitmap, 0)),
                            TASK_TIMEOUT_SECONDS,
                            TimeUnit.SECONDS
                    );
                    return toOcrResults(text);
                } catch (Throwable e) {
                    Log.e(TAG, "detect failed", e);
                    throw wrapFailure(e);
                } finally {
                    recycleDecodedBitmap(bitmap);
                }
            }
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    @Override
    public void onDestroy() {
        if (recognizer != null) {
            recognizer.close();
            recognizer = null;
        }
        super.onDestroy();
    }

    private TextRecognizer getRecognizer() {
        if (recognizer == null) {
            recognizer = TextRecognition.getClient(new ChineseTextRecognizerOptions.Builder().build());
        }
        return recognizer;
    }

    private List<OcrResult> toOcrResults(Text text) {
        List<OcrResult> results = new ArrayList<>();
        if (text == null) {
            return results;
        }
        for (Text.TextBlock block : text.getTextBlocks()) {
            for (Text.Line line : block.getLines()) {
                OcrResult result = new OcrResult();
                result.text = line.getText();
                result.confidence = safeConfidence(line.getConfidence());
                result.bounds = nonNullBounds(line.getBoundingBox());
                results.add(result);
            }
        }
        return results;
    }

    private float safeConfidence(Float confidence) {
        return confidence == null || confidence.isNaN() ? 0f : confidence;
    }

    private Rect nonNullBounds(Rect bounds) {
        return bounds == null ? new Rect() : bounds;
    }

    private RuntimeException wrapFailure(Throwable cause) {
        if (cause instanceof RuntimeException) {
            return (RuntimeException) cause;
        }
        if (cause instanceof Error) {
            throw (Error) cause;
        }
        return new IllegalStateException("ML Kit OCR engine failed", cause);
    }

    private Bitmap decodeImage(ParcelFileDescriptor descriptor, OcrOptions options) {
        Bundle extras = options == null ? null : options.extras;
        boolean useRaw = extras != null && extras.getBoolean(PaddleOcrOptionExtraKeys.RAW_IMAGE, false);
        if (useRaw) {
            int width = extras.getInt(PaddleOcrOptionExtraKeys.RAW_WIDTH, -1);
            int height = extras.getInt(PaddleOcrOptionExtraKeys.RAW_HEIGHT, -1);
            int stride = extras.getInt(PaddleOcrOptionExtraKeys.RAW_STRIDE, width * 4);
            String config = extras.getString(PaddleOcrOptionExtraKeys.RAW_CONFIG);
            if (width > 0 && height > 0 && Bitmap.Config.ARGB_8888.name().equals(config)) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    Bitmap decoded;
                    try {
                        decoded = tryDecodeSharedMemory(descriptor, width, height, stride);
                    } catch (Throwable e) {
                        decoded = null;
                    }
                    if (decoded != null) {
                        closeQuietly(descriptor);
                        return decoded;
                    }
                }
                return decodeRawStream(descriptor, width, height, stride);
            }
        }

        try (ParcelFileDescriptor closeable = descriptor) {
            Bitmap bitmap = BitmapFactory.decodeFileDescriptor(closeable.getFileDescriptor());
            if (bitmap == null) {
                throw new IllegalStateException("decode image failed");
            }
            return bitmap;
        } catch (IOException e) {
            throw new IllegalStateException("decode image failed", e);
        }
    }

    private void recycleDecodedBitmap(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    private Bitmap decodeRawStream(ParcelFileDescriptor descriptor, int width, int height, int stride) {
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        int rowBytes = width * 4;
        int total = stride * height;
        byte[] raw = new byte[total];
        try (ParcelFileDescriptor.AutoCloseInputStream input = new ParcelFileDescriptor.AutoCloseInputStream(descriptor)) {
            int offset = 0;
            while (offset < total) {
                int read = input.read(raw, offset, total - offset);
                if (read < 0) {
                    break;
                }
                offset += read;
            }
            if (offset < total) {
                throw new IllegalStateException("read raw image failed: " + offset + "/" + total);
            }
        } catch (IOException e) {
            throw new IllegalStateException("read raw image failed", e);
        }

        if (stride == rowBytes && bitmap.getRowBytes() == rowBytes) {
            bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(raw, 0, rowBytes * height));
        } else {
            ByteBuffer tmp = ByteBuffer.allocate(rowBytes * height);
            int pos = 0;
            for (int row = 0; row < height; row++) {
                tmp.put(raw, pos, rowBytes);
                pos += stride;
            }
            tmp.rewind();
            bitmap.copyPixelsFromBuffer(tmp);
        }
        return bitmap;
    }

    private Bitmap tryDecodeSharedMemory(ParcelFileDescriptor descriptor, int width, int height, int stride) throws IOException {
        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(descriptor.getFileDescriptor());

        SharedMemory sharedMemory;
        try {
            sharedMemory = SharedMemory.fromFileDescriptor(dup);
        } catch (Throwable e) {
            closeQuietly(dup);
            return null;
        }

        ByteBuffer buffer;
        try {
            buffer = sharedMemory.mapReadOnly();
        } catch (Throwable e) {
            sharedMemory.close();
            throw new IllegalStateException(e);
        }

        buffer.order(ByteOrder.nativeOrder());
        try {
            Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            int rowBytes = width * 4;
            if (stride == rowBytes && bitmap.getRowBytes() == rowBytes) {
                buffer.limit(rowBytes * height);
                bitmap.copyPixelsFromBuffer(buffer);
            } else {
                byte[] packed = new byte[rowBytes * height];
                int srcPos = 0;
                int dstPos = 0;
                while (dstPos < packed.length) {
                    buffer.position(srcPos);
                    buffer.get(packed, dstPos, rowBytes);
                    srcPos += stride;
                    dstPos += rowBytes;
                }
                bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(packed));
            }
            return bitmap;
        } finally {
            SharedMemory.unmap(buffer);
            sharedMemory.close();
        }
    }

    private static void closeQuietly(ParcelFileDescriptor descriptor) {
        try {
            descriptor.close();
        } catch (Throwable ignored) {
            // Ignore close failures.
        }
    }
}
