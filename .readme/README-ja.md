<!--suppress HtmlDeprecatedAttribute, HttpUrlsUsage -->

<div align="center">
  <p>
    <picture>
      <source srcset="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap-night/ic_launcher.png?raw=true" media="(prefers-color-scheme: dark)" />
      <img src="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap/ic_launcher.png?raw=true" alt="autojs6-plugin-mlkit-ocr-ic-launcher" border="0" width="128" />
    </picture>
  </p>

  <p>Google ML Kit を利用した中国語 OCR</p>

  <p>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/releases"><img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?label=Release"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/issues"><img alt="GitHub closed issues" src="https://img.shields.io/github/issues/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=A24232&label=Issues"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/LICENSE"><img alt="GitHub License" src="https://img.shields.io/github/license/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=534BAE&label=License"/></a>
  </p>
</div>

******

### 言語 (Languages)

******

現在の README.md は以下の言語をサポートします:

- [简体中文 [zh-Hans]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hans.md)
- [繁體中文 (香港) [zh-Hant-HK]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-HK.md)
- [繁體中文 (台灣) [zh-Hant-TW]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-TW.md)
- [English [en]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-en.md)
- [Français [fr]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-fr.md)
- [Español [es]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-es.md)
- 日本語 [ja] # 現在
- [한국어 [ko]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ko.md)
- [Русский [ru]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ru.md)
- [العربية [ar]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ar.md)

******

### 概要

******

AutoJs6 ML Kit OCR プラグインは AutoJs6 に Google ML Kit ベースの中国語テキスト認識機能を提供します. 認識したテキスト行, 信頼度, 境界ボックス情報を返せます.

******

### 機能

******

- 共有 OCR プラグインサービスを提供します. プラグイン ID は `mlkit-ocr-chinese`, エンジンは `mlkit-ocr`, バリアントは `chinese` です.
- `org.autojs.plugin.PADDLE_OCR` で OCR AIDL インターフェイスを公開し, AutoJs6 ホスト側の OCR プラグイン検出機構と互換性があります.
- `recognizeText` はテキスト行リストを返し, `detect` はテキスト, 信頼度, テキスト行の境界ボックスを返します.
- エンコード済み画像入力と `ARGB_8888` の生画像バッファ入力をサポートします.
- プラグイン情報, 使用説明, README, CHANGELOG はスペイン語/フランス語/ロシア語/アラビア語/日本語/韓国語/英語/簡体字中国語/香港繁体字中国語/台湾繁体字中国語に対応します.
- `com.google.mlkit:text-recognition-chinese` を基盤にしています.

******

### プラグインインターフェイス

******

ホストは以下の識別情報でプラグインを検出して呼び出せます:

```text
action: org.autojs.plugin.PADDLE_OCR
engine: mlkit-ocr
variant: chinese
plugin id: mlkit-ocr-chinese
```

`recognizeText` は文字列リストを返します; `detect` は `text`, `confidence`, `bounds` を含む OCR 結果オブジェクトを返します.

******

### リリース履歴

******

# v1.0.1

###### 2026/09/11

* `改善` 64 ビットのネイティブライブラリの 16 KB ページアラインメントをビルド時に検証, manifest 契約の検査と JSON レポートに対応

# v1.0.0

###### 2026/09/01

* `追加` ML Kit 中国語 OCR プラグインサービスを追加しました. プラグイン ID は `mlkit-ocr-chinese`, エンジンは `mlkit-ocr`, バリアントは `chinese` です
* `追加` 共有 OCR AIDL action `org.autojs.plugin.PADDLE_OCR` によるホスト検出と呼び出しを追加しました
* `追加` `recognizeText` と `detect` インターフェイスを追加しました. 認識テキスト, 信頼度, テキスト行の境界ボックスを返します
* `追加` エンコード済み画像入力と `ARGB_8888` 生画像バッファ入力を追加しました. Android 13 以降では SharedMemory 読み取りを優先します
* `追加` プラグイン情報と使用説明の多言語リソースを追加しました: スペイン語/フランス語/ロシア語/アラビア語/日本語/韓国語/英語/簡体字中国語/香港繁体字中国語/台湾繁体字中国語
* `追加` README と CHANGELOG 用の JSON ソースと `.python/generate_markdown.py` 生成フローを追加しました
* `追加` `arm64-v8a`/`armeabi-v7a`/`x86_64` と `universal` APK の ABI 分割ビルドを追加しました
* `追加` リリース APK ファイル名にバージョン, ABI バリアント, CRC32 ダイジェストを含めました
* `改善` README のレイアウトと Gradle プラットフォームのバージョン管理方式を統一
* `改善` プラグインの説明を簡潔にし, 多言語リソースの句読点を統一

##### その他のリリース履歴

* [CHANGELOG-ja.md](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/assets/doc/CHANGELOG-ja.md)

******

### ビルド

******

```powershell
.\gradlew.bat :app:assembleDebug
```

Release ビルド:

```powershell
.\gradlew.bat :app:assembleRelease
```

ビルドパラメータは `version.properties` から取得します. 現在の最小 SDK は 24, ターゲット SDK は 36 です.

******

### リソース構成

******

```text
.readme/lang_*.json
.changelog/lang_*.json
.python/generate_markdown.py
app/src/main/assets/doc/CHANGELOG-*.md
app/src/main/res/values-*/strings.xml
app/src/main/res/raw-*/plugin_instruction.md
```

`strings.xml` はローカライズされたプラグイン説明を提供します; `plugin_instruction.md` はホスト側で表示される使用説明を提供します. README と CHANGELOG は `.python/generate_markdown.py` により JSON ソースから生成されます.

******

### 関連リンク

******

- AutoJs6 ドキュメント: https://docs.autojs6.com
- Google ML Kit テキスト認識ドキュメント: https://developers.google.com/ml-kit/vision/text-recognition/v2/android


[16 KB page alignment and build verification](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/docs/16kb.md)
