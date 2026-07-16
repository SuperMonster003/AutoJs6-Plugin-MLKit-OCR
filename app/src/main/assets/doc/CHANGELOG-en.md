# v1.0.0

###### 2026/07/16

* `Feature` Added the ML Kit Chinese OCR plugin service with plugin ID `mlkit-ocr-chinese`, engine `mlkit-ocr`, and variant `chinese`
* `Feature` Added host discovery and invocation through the shared OCR AIDL action `org.autojs.plugin.PADDLE_OCR`
* `Feature` Added `recognizeText` and `detect` interfaces that return recognized text, confidence values, and text line bounds
* `Feature` Added support for encoded image input and raw `ARGB_8888` image buffers, with a SharedMemory read path preferred on Android 13 and later
* `Feature` Added localized plugin metadata and usage instructions for Spanish, French, Russian, Arabic, Japanese, Korean, English, Simplified Chinese, Hong Kong Traditional Chinese, and Taiwan Traditional Chinese
* `Feature` Added JSON sources and `.python/generate_markdown.py` generation for README and CHANGELOG files
* `Feature` Added ABI split APK builds for `arm64-v8a`, `armeabi-v7a`, `x86_64`, and a `universal` APK
* `Feature` Release APK filenames now include the version, ABI variant, and CRC32 digest
