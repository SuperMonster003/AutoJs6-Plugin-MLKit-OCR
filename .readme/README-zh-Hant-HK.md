<!--suppress HtmlDeprecatedAttribute, HttpUrlsUsage -->

<div align="center">
  <p>
    <picture>
      <source srcset="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap-night/ic_launcher.png?raw=true" media="(prefers-color-scheme: dark)" />
      <img src="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap/ic_launcher.png?raw=true" alt="autojs6-plugin-mlkit-ocr-ic-launcher" border="0" width="128" />
    </picture>
  </p>

  <p>基於 Google ML Kit 的中文 OCR</p>

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
- 繁體中文 (香港) [zh-Hant-HK] # 目前
- [繁體中文 (台灣) [zh-Hant-TW]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-TW.md)
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

AutoJs6 ML Kit OCR 插件為 AutoJs6 提供基於 Google ML Kit 的中文文字識別能力, 可返回識別文本行, 置信度和邊界框資訊.

******

### 功能

******

- 提供共享 OCR 插件服務, 插件 ID 為 `mlkit-ocr-chinese`, 引擎為 `mlkit-ocr`, 變體為 `chinese`.
- 通過 `org.autojs.plugin.PADDLE_OCR` 暴露 OCR AIDL 接口, 兼容 AutoJs6 宿主側 OCR 插件發現機制.
- 支援 `recognizeText` 返回文本行列表, 支援 `detect` 返回文本, 置信度和文本行邊界框.
- 支援編碼圖片輸入和 `ARGB_8888` 原始圖片緩衝區輸入.
- 插件資訊, 使用說明, README 與 CHANGELOG 均支援西班牙語/法語/俄語/阿拉伯語/日語/韓語/英語/簡體中文/香港繁體/台灣繁體.
- 基於 `com.google.mlkit:text-recognition-chinese`.
- 影像最多包含 16777216 個像素, 原始影像緩衝區上限為 64 MiB

******

### 插件接口

******

宿主可通過以下身份發現並調用插件:

```text
action: org.autojs.plugin.PADDLE_OCR
engine: mlkit-ocr
variant: chinese
plugin id: mlkit-ocr-chinese
```

`recognizeText` 返回字符串列表; `detect` 返回 OCR 結果列表, 每項包含 `text`, `confidence` 和 `bounds`.

******

### 發行歷史

******

# v1.0.2

###### 2026/09/13

* `修復` 外掛中心顯示的版本與 ABI 資訊符合實際安裝的 APK
* `優化` 發佈下載檔案產生前校驗 APK 版本, 簽署與完整變體集合
* `優化` 影像最多包含 16777216 個像素, 原始影像緩衝區上限為 64 MiB

# v1.0.1

###### 2026/09/11

* `優化` 建置階段校驗 64 位原生程式庫的 16 KB 頁面大小對齊, 檢查 manifest 契約並輸出 JSON 報告

# v1.0.0

###### 2026/09/01

* `新增` ML Kit 中文 OCR 插件服務, 插件 ID 為 `mlkit-ocr-chinese`, 引擎為 `mlkit-ocr`, 變體為 `chinese`
* `新增` 支援通過共享 OCR AIDL action `org.autojs.plugin.PADDLE_OCR` 發現並調用插件
* `新增` 提供 `recognizeText` 和 `detect` 接口, 返回識別文本, 置信度和文本行邊界框
* `新增` 支援編碼圖片輸入和 `ARGB_8888` 原始圖片緩衝區輸入, Android 13 及以上優先嘗試 SharedMemory 讀取
* `新增` 插件資訊和使用說明的多語言資源: 西班牙語/法語/俄語/阿拉伯語/日語/韓語/英語/簡體中文/香港繁體/台灣繁體
* `新增` README 和 CHANGELOG 的 JSON 源文件及 `.python/generate_markdown.py` 生成流程
* `新增` 按 ABI 構建 APK, 包括 `arm64-v8a`/`armeabi-v7a`/`x86_64` 以及 `universal` 通用包
* `新增` 發布 APK 文件名包含版本號, ABI 變體和 CRC32 摘要
* `優化` 統一 README 版式與 Gradle 平台版本管理方式
* `優化` 精簡插件描述並規範多語言資源中的標點符號

##### 更多發行歷史可參閱

* [CHANGELOG-zh-Hant-HK.md](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/assets/doc/CHANGELOG-zh-Hant-HK.md)

******

### 構建

******

```powershell
.\gradlew.bat :app:assembleDebug
```

Release 構建:

```powershell
.\gradlew.bat :app:assembleRelease
```

構建參數來自 `version.properties`, 目前最低 SDK 為 24, 目標 SDK 為 36.

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

`strings.xml` 提供插件描述本地化; `plugin_instruction.md` 提供宿主側展示的插件使用說明. README 與 CHANGELOG 由 `.python/generate_markdown.py` 根據 JSON 源文件生成.

******

### 相關連結

******

- AutoJs6 文件: https://docs.autojs6.com
- Google ML Kit 文本識別文件: https://developers.google.com/ml-kit/vision/text-recognition/v2/android


[16 KB page alignment and build verification](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/docs/16kb.md)
