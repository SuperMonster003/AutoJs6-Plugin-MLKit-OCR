<!--suppress HtmlDeprecatedAttribute, HttpUrlsUsage -->

<div align="center">
  <p>
    <picture>
      <source srcset="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap-night/ic_launcher.png?raw=true" media="(prefers-color-scheme: dark)" />
      <img src="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap/ic_launcher.png?raw=true" alt="autojs6-plugin-mlkit-ocr-ic-launcher" border="0" width="128" />
    </picture>
  </p>

  <p>使用 Google ML Kit 的中文 OCR</p>

  <p>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/releases"><img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?label=Release"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/issues"><img alt="GitHub closed issues" src="https://img.shields.io/github/issues/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=A24232&label=Issues"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/LICENSE"><img alt="GitHub License" src="https://img.shields.io/github/license/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=534BAE&label=License"/></a>
  </p>
</div>

******

### 語言 (Languages)

******

目前 README.md 支援以下語言:

- [简体中文 [zh-Hans]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hans.md)
- [繁體中文 (香港) [zh-Hant-HK]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-HK.md)
- 繁體中文 (台灣) [zh-Hant-TW] # 目前
- [English [en]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-en.md)
- [Français [fr]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-fr.md)
- [Español [es]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-es.md)
- [日本語 [ja]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ja.md)
- [한국어 [ko]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ko.md)
- [Русский [ru]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ru.md)
- [العربية [ar]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ar.md)

******

### 簡介

******

AutoJs6 ML Kit OCR 外掛為 AutoJs6 提供基於 Google ML Kit 的中文文字辨識能力, 可回傳辨識文字行, 信賴度和邊界框資訊.

******

### 功能

******

- 提供共享 OCR 外掛服務, 外掛 ID 為 `mlkit-ocr-chinese`, 引擎為 `mlkit-ocr`, 變體為 `chinese`.
- 透過 `org.autojs.plugin.PADDLE_OCR` 暴露 OCR AIDL 介面, 相容 AutoJs6 宿主端 OCR 外掛探索機制.
- 支援 `recognizeText` 回傳文字行列表, 支援 `detect` 回傳文字, 信賴度和文字行邊界框.
- 支援編碼圖片輸入和 `ARGB_8888` 原始圖片緩衝區輸入.
- 外掛資訊, 使用說明, README 與 CHANGELOG 均支援西班牙文/法文/俄文/阿拉伯文/日文/韓文/英文/簡體中文/香港繁體/台灣繁體.
- 基於 `com.google.mlkit:text-recognition-chinese`.
- 影像最多包含 16777216 個像素, 原始影像緩衝區上限為 64 MiB

******

### 外掛介面

******

宿主可透過以下身分探索並呼叫外掛:

```text
action: org.autojs.plugin.PADDLE_OCR
engine: mlkit-ocr
variant: chinese
plugin id: mlkit-ocr-chinese
```

`recognizeText` 回傳字串列表; `detect` 回傳 OCR 結果列表, 每項包含 `text`, `confidence` 和 `bounds`.

******

### 發行歷史

******

# v1.0.2

###### 2026/09/13

* `修復` 外掛中心顯示的版本與 ABI 資訊符合實際安裝的 APK
* `最佳化` 發行下載檔案產生前驗證 APK 版本, 簽章與完整變體集合
* `最佳化` 影像最多包含 16777216 個像素, 原始影像緩衝區上限為 64 MiB

# v1.0.1

###### 2026/09/11

* `最佳化` 建置階段校驗 64 位原生函式庫的 16 KB 頁面大小對齊, 檢查 manifest 契約並輸出 JSON 報告

# v1.0.0

###### 2026/09/01

* `新增` ML Kit 中文 OCR 外掛服務, 外掛 ID 為 `mlkit-ocr-chinese`, 引擎為 `mlkit-ocr`, 變體為 `chinese`
* `新增` 支援透過共享 OCR AIDL action `org.autojs.plugin.PADDLE_OCR` 探索並呼叫外掛
* `新增` 提供 `recognizeText` 和 `detect` 介面, 回傳辨識文字, 信賴度和文字行邊界框
* `新增` 支援編碼圖片輸入和 `ARGB_8888` 原始圖片緩衝區輸入, Android 13 及以上優先嘗試 SharedMemory 讀取
* `新增` 外掛資訊和使用說明的多語言資源: 西班牙文/法文/俄文/阿拉伯文/日文/韓文/英文/簡體中文/香港繁體/台灣繁體
* `新增` README 和 CHANGELOG 的 JSON 來源檔及 `.python/generate_markdown.py` 產生流程
* `新增` 按 ABI 建置 APK, 包括 `arm64-v8a`/`armeabi-v7a`/`x86_64` 以及 `universal` 通用包
* `新增` 發布 APK 檔名包含版本號, ABI 變體和 CRC32 摘要
* `最佳化` 統一 README 版式與 Gradle 平台版本管理方式
* `最佳化` 精簡外掛描述並規範多語言資源中的標點符號

##### 更多發行歷史可參閱

* [CHANGELOG-zh-Hant-TW.md](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/assets/doc/CHANGELOG-zh-Hant-TW.md)

******

### 建置

******

```powershell
.\gradlew.bat :app:assembleDebug
```

Release 建置:

```powershell
.\gradlew.bat :app:assembleRelease
```

建置參數來自 `version.properties`, 目前最低 SDK 為 24, 目標 SDK 為 36.

******

### 資源結構

******

```text
.readme/lang_*.json
.changelog/lang_*.json
.python/generate_markdown.py
app/src/main/assets/doc/CHANGELOG-*.md
app/src/main/res/values-*/strings.xml
app/src/main/res/raw-*/plugin_instruction.md
```

`strings.xml` 提供外掛描述在地化; `plugin_instruction.md` 提供宿主端展示的外掛使用說明. README 與 CHANGELOG 由 `.python/generate_markdown.py` 根據 JSON 來源檔產生.

******

### 相關連結

******

- AutoJs6 文件: https://docs.autojs6.com
- Google ML Kit 文字辨識文件: https://developers.google.com/ml-kit/vision/text-recognition/v2/android


[16 KB page alignment and build verification](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/docs/16kb.md)
