ML Kit OCR (Chinese) provides Chinese text recognition through the shared AutoJs6 OCR plugin interface.

Plugin identity:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`

The plugin uses Google ML Kit Chinese text recognition. `recognizeText` returns recognized text lines, and `detect` returns text, confidence, and line bounds.

It accepts encoded image input and raw `ARGB_8888` image buffers from the host.
