# AutoJs6 Plugin: ML Kit OCR

External OCR plugin for AutoJs6 using Google ML Kit Chinese text recognition.

## Build

```powershell
./gradlew :app:assembleDebug
```

## Install

```powershell
./gradlew :app:installDebug
```

The plugin exposes the shared AutoJs6 OCR AIDL action:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`
