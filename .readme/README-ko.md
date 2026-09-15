<!--suppress HtmlDeprecatedAttribute, HttpUrlsUsage -->

<div align="center">
  <p>
    <picture>
      <source srcset="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap-night/ic_launcher.png?raw=true" media="(prefers-color-scheme: dark)" />
      <img src="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap/ic_launcher.png?raw=true" alt="autojs6-plugin-mlkit-ocr-ic-launcher" border="0" width="128" />
    </picture>
  </p>

  <p>Google ML Kit 기반 중국어 OCR</p>

  <p>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/releases"><img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?label=Release"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/issues"><img alt="GitHub closed issues" src="https://img.shields.io/github/issues/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=A24232&label=Issues"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/LICENSE"><img alt="GitHub License" src="https://img.shields.io/github/license/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=534BAE&label=License"/></a>
  </p>
</div>

******

### 언어 (Languages)

******

현재 README.md 는 다음 언어를 지원합니다:

- [简体中文 [zh-Hans]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hans.md)
- [繁體中文 (香港) [zh-Hant-HK]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-HK.md)
- [繁體中文 (台灣) [zh-Hant-TW]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-TW.md)
- [English [en]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-en.md)
- [Français [fr]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-fr.md)
- [Español [es]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-es.md)
- [日本語 [ja]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ja.md)
- 한국어 [ko] # 현재
- [Русский [ru]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ru.md)
- [العربية [ar]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ar.md)

******

### 소개

******

AutoJs6 ML Kit OCR 플러그인은 AutoJs6 에 Google ML Kit 기반 중국어 텍스트 인식 기능을 제공합니다. 인식된 텍스트 줄, 신뢰도, 경계 상자 정보를 반환할 수 있습니다.

******

### 기능

******

- 공유 OCR 플러그인 서비스를 제공합니다. 플러그인 ID 는 `mlkit-ocr-chinese`, 엔진은 `mlkit-ocr`, 변형은 `chinese` 입니다.
- `org.autojs.plugin.PADDLE_OCR` 로 OCR AIDL 인터페이스를 노출하며 AutoJs6 호스트의 OCR 플러그인 검색 흐름과 호환됩니다.
- `recognizeText` 는 텍스트 줄 목록을 반환하고 `detect` 는 텍스트, 신뢰도, 텍스트 줄 경계 상자를 반환합니다.
- 인코딩된 이미지 입력과 `ARGB_8888` 원시 이미지 버퍼 입력을 지원합니다.
- 플러그인 정보, 사용 설명, README, CHANGELOG 는 스페인어/프랑스어/러시아어/아랍어/일본어/한국어/영어/중국어 간체/홍콩 번체 중국어/대만 번체 중국어를 지원합니다.
- `com.google.mlkit:text-recognition-chinese` 를 기반으로 합니다.
- 이미지는 최대 16777216픽셀, 원시 이미지 버퍼는 최대 64 MiB까지 지원
- 인코딩된 이미지는 최대 64 MiB이며 파일 디스크립터와 파이프를 지원합니다

******

### 플러그인 인터페이스

******

호스트는 다음 식별 정보로 플러그인을 검색하고 호출할 수 있습니다:

```text
action: org.autojs.plugin.PADDLE_OCR
engine: mlkit-ocr
variant: chinese
plugin id: mlkit-ocr-chinese
```

`recognizeText` 는 문자열 목록을 반환합니다; `detect` 는 `text`, `confidence`, `bounds` 를 포함하는 OCR 결과 객체를 반환합니다.

******

### 릴리스 기록

******

# v1.0.3

###### 2026/09/15

* `개선` compileSdk 와 targetSdk 를 37 (Android 17) 로 올리며, 플러그인 동작은 새 대상 버전의 영향을 받지 않음

# v1.0.2

###### 2026/09/13

* `수정` 플러그인 센터의 버전과 ABI 정보가 설치된 APK와 일치
* `수정` 인코딩된 이미지는 최대 64 MiB이며 파일 디스크립터와 파이프를 지원합니다
* `수정` 버전 날짜를 일관된 영어 형식으로 표시
* `개선` 다운로드 파일 생성 전에 릴리스 APK의 버전, 서명 및 전체 변형 구성을 검증
* `개선` 이미지는 최대 16777216픽셀, 원시 이미지 버퍼는 최대 64 MiB까지 지원
* `개선` 네이티브 ABI 패키징과 플러그인 메타데이터를 arm64-v8a, armeabi-v7a, x86, x86_64로 확장하고 범용 APK와 ABI별 APK를 일치시킴

# v1.0.1

###### 2026/09/11

* `개선` 64비트 네이티브 라이브러리의 16 KB 페이지 정렬을 빌드 시 검증, manifest 계약 검사 및 JSON 보고서 지원

##### 더 많은 릴리스 기록

* [CHANGELOG-ko.md](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/assets/doc/CHANGELOG-ko.md)

******

### 빌드

******

```powershell
.\gradlew.bat :app:assembleDebug
```

Release 빌드:

```powershell
.\gradlew.bat :app:assembleRelease
```

빌드 매개변수는 `version.properties` 에서 가져옵니다. 현재 최소 SDK 는 24 이고 대상 SDK 는 36 입니다.

******

### 리소스 구조

******

```text
.readme/lang_*.json
.changelog/lang_*.json
.python/generate_markdown.py
app/src/main/assets/doc/CHANGELOG-*.md
app/src/main/res/values-*/strings.xml
app/src/main/res/raw-*/plugin_instruction.md
```

`strings.xml` 은 현지화된 플러그인 설명을 제공합니다; `plugin_instruction.md` 는 호스트에 표시되는 사용 설명을 제공합니다. README 와 CHANGELOG 는 `.python/generate_markdown.py` 가 JSON 소스에서 생성합니다.

******

### 관련 링크

******

- AutoJs6 문서: https://docs.autojs6.com
- Google ML Kit 텍스트 인식 문서: https://developers.google.com/ml-kit/vision/text-recognition/v2/android


[16 KB page alignment and build verification](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/docs/16kb.md)
