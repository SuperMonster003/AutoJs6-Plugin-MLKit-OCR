<!--suppress HtmlDeprecatedAttribute, HttpUrlsUsage -->

<div align="center">
  <p>
    <picture>
      <source srcset="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap-night/ic_launcher.png?raw=true" media="(prefers-color-scheme: dark)" />
      <img src="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap/ic_launcher.png?raw=true" alt="autojs6-plugin-mlkit-ocr-ic-launcher" border="0" width="128" />
    </picture>
  </p>

  <p>Плагин ML Kit для китайского OCR в AutoJs6</p>

  <p>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/releases"><img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?label=Release"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/issues"><img alt="GitHub closed issues" src="https://img.shields.io/github/issues/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=A24232&label=Issues"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/commit/5101d138468e1a7a68a443635ec455c7bc0bd632"><img alt="Created" src="https://img.shields.io/date/1783182996?color=2e7d32&label=Created"/></a>
    <br>
    <a href="https://developer.android.com/studio/archive"><img alt="Android Studio" src="https://img.shields.io/badge/Android%20Studio-2023.3+-B64FC8"/></a>
    <a href="https://www.jetbrains.com/idea/download/other.html"><img alt="IntelliJ IDEA" src="https://img.shields.io/badge/IntelliJ%20IDEA-2023.3+-EE4677"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/LICENSE"><img alt="GitHub License" src="https://img.shields.io/github/license/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=534BAE&label=License"/></a>
  </p>
</div>

******

### Языки

******

Текущий README.md поддерживает следующие языки:

- [简体中文 [zh-Hans]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hans.md)
- [繁體中文 (香港) [zh-Hant-HK]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-HK.md)
- [繁體中文 (台灣) [zh-Hant-TW]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-TW.md)
- [English [en]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-en.md)
- [Français [fr]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-fr.md)
- [Español [es]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-es.md)
- [日本語 [ja]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ja.md)
- [한국어 [ko]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ko.md)
- Русский [ru] # текущий
- [العربية [ar]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ar.md)

******

### Введение

******

Плагин AutoJs6 ML Kit OCR предоставляет AutoJs6 распознавание китайского текста на базе Google ML Kit. Он может возвращать распознанные строки текста, значения уверенности и ограничивающие прямоугольники.

******

### Возможности

******

- Предоставляет общий сервис OCR плагина с ID `mlkit-ocr-chinese`, движком `mlkit-ocr` и вариантом `chinese`.
- Открывает OCR AIDL интерфейс через `org.autojs.plugin.PADDLE_OCR` и работает с механизмом обнаружения OCR плагинов хоста AutoJs6.
- Поддерживает `recognizeText` для списков строк текста и `detect` для текста, уверенности и границ строк.
- Поддерживает ввод кодированных изображений и ввод сырых буферов изображений `ARGB_8888`.
- Метаданные плагина, инструкции по использованию, README и CHANGELOG локализованы на испанский/французский/русский/арабский/японский/корейский/английский/упрощенный китайский/традиционный китайский Гонконга/традиционный китайский Тайваня.
- Основан на `com.google.mlkit:text-recognition-chinese`.

******

### Интерфейс Плагина

******

Хост может обнаруживать и вызывать плагин со следующей идентичностью:

```text
action: org.autojs.plugin.PADDLE_OCR
engine: mlkit-ocr
variant: chinese
plugin id: mlkit-ocr-chinese
```

`recognizeText` возвращает список строк; `detect` возвращает объекты результата OCR с полями `text`, `confidence` и `bounds`.

******

### История Выпусков

******

# v1.0.0

###### 2026/07/16

* `Добавлено` Добавлен сервис плагина ML Kit для китайского OCR с ID `mlkit-ocr-chinese`, движком `mlkit-ocr` и вариантом `chinese`
* `Добавлено` Добавлены обнаружение и вызов хостом через общее OCR AIDL действие `org.autojs.plugin.PADDLE_OCR`
* `Добавлено` Добавлены интерфейсы `recognizeText` и `detect`, которые возвращают распознанный текст, значения уверенности и границы строк текста
* `Добавлено` Добавлена поддержка ввода кодированных изображений и сырых буферов изображений `ARGB_8888`, с предпочтительным чтением SharedMemory на Android 13 и новее
* `Добавлено` Добавлены локализованные метаданные плагина и инструкции по использованию на испанском, французском, русском, арабском, японском, корейском, английском, упрощенном китайском, традиционном китайском Гонконга и традиционном китайском Тайваня
* `Добавлено` Добавлены JSON источники и генерация `.python/generate_markdown.py` для файлов README и CHANGELOG
* `Добавлено` Добавлены APK сборки с разделением ABI для `arm64-v8a`, `armeabi-v7a`, `x86_64` и APK `universal`
* `Добавлено` Имена APK файлов выпуска теперь включают версию, вариант ABI и дайджест CRC32

##### Больше истории выпусков

* [CHANGELOG-ru.md](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.changelog/CHANGELOG-ru.md)

******

### Сборка

******

```powershell
.\gradlew.bat :app:assembleDebug
```

Release сборка:

```powershell
.\gradlew.bat :app:assembleRelease
```

Параметры сборки берутся из `version.properties`; текущий минимальный SDK равен 24, целевой SDK равен 36.

******

### Структура Ресурсов

******

```text
.readme/lang_*.json
.changelog/lang_*.json
.python/generate_markdown.py
app/src/main/assets/doc/CHANGELOG-*.md
app/src/main/res/values-*/strings.xml
app/src/main/res/raw-*/plugin_instruction.md
```

`strings.xml` содержит локализованные описания плагина; `plugin_instruction.md` содержит инструкции по использованию, показываемые хостом. README и CHANGELOG генерируются из JSON источников с помощью `.python/generate_markdown.py`.

******

### Ссылки

******

- Документация AutoJs6: https://docs.autojs6.com
- Документация распознавания текста Google ML Kit: https://developers.google.com/ml-kit/vision/text-recognition/v2/android
