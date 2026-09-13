******

### Release History

******

# v1.0.2

###### 2026/09/13

* `Fix` Plugin center version and ABI information matches the installed plugin APK
* `Improvement` Validate release APK versions, signing and the complete variant set before creating download artifacts
* `Improvement` Images may contain at most 16777216 pixels; raw image buffers are limited to 64 MiB

# v1.0.1

###### 2026/09/11

* `Improvement` Build verification of 16 KB page alignment for 64-bit native libraries, including manifest contract checks and JSON reports

# v1.0.0

###### 2026/09/01

* `Feature` Added the ML Kit Chinese OCR plugin service with plugin ID `mlkit-ocr-chinese`, engine `mlkit-ocr`, and variant `chinese`
* `Feature` Added host discovery and invocation through the shared OCR AIDL action `org.autojs.plugin.PADDLE_OCR`
* `Feature` Added `recognizeText` and `detect` interfaces that return recognized text, confidence values, and text line bounds
* `Feature` Added support for encoded image input and raw `ARGB_8888` image buffers, with a SharedMemory read path preferred on Android 13 and later
* `Feature` Added localized plugin metadata and usage instructions for Spanish, French, Russian, Arabic, Japanese, Korean, English, Simplified Chinese, Hong Kong Traditional Chinese, and Taiwan Traditional Chinese
* `Feature` Added JSON sources and `.python/generate_markdown.py` generation for README and CHANGELOG files
* `Feature` Added ABI split APK builds for `arm64-v8a`, `armeabi-v7a`, `x86_64`, and a `universal` APK
* `Feature` Release APK filenames now include the version, ABI variant, and CRC32 digest
* `Improvement` Standardize the README layout and Gradle platform version management
* `Improvement` Refine the plugin description and normalize punctuation in multilingual resources
