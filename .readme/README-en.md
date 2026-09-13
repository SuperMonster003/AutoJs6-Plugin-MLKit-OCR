<!--suppress HtmlDeprecatedAttribute, HttpUrlsUsage -->

<div align="center">
  <p>
    <picture>
      <source srcset="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap-night/ic_launcher.png?raw=true" media="(prefers-color-scheme: dark)" />
      <img src="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap/ic_launcher.png?raw=true" alt="autojs6-plugin-mlkit-ocr-ic-launcher" border="0" width="128" />
    </picture>
  </p>

  <p>Chinese OCR powered by Google ML Kit</p>

  <p>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/releases"><img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?label=Release"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/issues"><img alt="GitHub closed issues" src="https://img.shields.io/github/issues/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=A24232&label=Issues"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/LICENSE"><img alt="GitHub License" src="https://img.shields.io/github/license/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=534BAE&label=License"/></a>
  </p>
</div>

******

### Languages

******

The current README.md supports the following languages:

- [简体中文 [zh-Hans]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hans.md)
- [繁體中文 (香港) [zh-Hant-HK]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-HK.md)
- [繁體中文 (台灣) [zh-Hant-TW]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-TW.md)
- English [en] # current
- [Français [fr]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-fr.md)
- [Español [es]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-es.md)
- [日本語 [ja]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ja.md)
- [한국어 [ko]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ko.md)
- [Русский [ru]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ru.md)
- [العربية [ar]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ar.md)

******

### Introduction

******

The AutoJs6 ML Kit OCR Plugin provides Google ML Kit based Chinese text recognition for AutoJs6. It can return recognized text lines, confidence values, and bounding boxes.

******

### Features

******

- Provides the shared OCR plugin service with plugin ID `mlkit-ocr-chinese`, engine `mlkit-ocr`, and variant `chinese`.
- Exposes the OCR AIDL interface through `org.autojs.plugin.PADDLE_OCR` and works with the AutoJs6 host OCR plugin discovery flow.
- Supports `recognizeText` for text line lists and `detect` for text, confidence, and line bounds.
- Supports encoded image input and raw `ARGB_8888` image buffer input.
- Plugin metadata, usage instructions, README, and CHANGELOG are localized for Spanish, French, Russian, Arabic, Japanese, Korean, English, Simplified Chinese, Hong Kong Traditional Chinese, and Taiwan Traditional Chinese.
- Built on `com.google.mlkit:text-recognition-chinese`.
- Images may contain at most 16777216 pixels; raw image buffers are limited to 64 MiB
- Encoded image input is limited to 64 MiB and supports file descriptors and pipes

******

### Plugin Interface

******

The host can discover and invoke the plugin with the following identity:

```text
action: org.autojs.plugin.PADDLE_OCR
engine: mlkit-ocr
variant: chinese
plugin id: mlkit-ocr-chinese
```

`recognizeText` returns a string list; `detect` returns OCR result objects containing `text`, `confidence`, and `bounds`.

******

### Release History

******

# v1.0.2

###### 2026/09/13

* `Fix` Plugin center version and ABI information matches the installed plugin APK
* `Fix` Encoded image input is limited to 64 MiB and supports file descriptors and pipes
* `Fix` Version dates use a consistent English format
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

##### For more release history

* [CHANGELOG-en.md](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/assets/doc/CHANGELOG-en.md)

******

### Build

******

```powershell
.\gradlew.bat :app:assembleDebug
```

Release build:

```powershell
.\gradlew.bat :app:assembleRelease
```

Build parameters come from `version.properties`; the current minimum SDK is 24 and target SDK is 36.

******

### Resource Layout

******

```text
.readme/lang_*.json
.changelog/lang_*.json
.python/generate_markdown.py
app/src/main/assets/doc/CHANGELOG-*.md
app/src/main/res/values-*/strings.xml
app/src/main/res/raw-*/plugin_instruction.md
```

`strings.xml` contains localized plugin descriptions; `plugin_instruction.md` contains usage instructions displayed by the host. README and CHANGELOG files are generated from JSON sources by `.python/generate_markdown.py`.

******

### Links

******

- AutoJs6 documentation: https://docs.autojs6.com
- Google ML Kit text recognition documentation: https://developers.google.com/ml-kit/vision/text-recognition/v2/android


[16 KB page alignment and build verification](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/docs/16kb.md)
