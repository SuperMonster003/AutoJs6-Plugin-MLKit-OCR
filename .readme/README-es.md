<!--suppress HtmlDeprecatedAttribute, HttpUrlsUsage -->

<div align="center">
  <p>
    <picture>
      <source srcset="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap-night/ic_launcher.png?raw=true" media="(prefers-color-scheme: dark)" />
      <img src="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap/ic_launcher.png?raw=true" alt="autojs6-plugin-mlkit-ocr-ic-launcher" border="0" width="128" />
    </picture>
  </p>

  <p>Complemento OCR chino de ML Kit para AutoJs6</p>

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

### Idiomas

******

El README.md actual admite los siguientes idiomas:

- [简体中文 [zh-Hans]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hans.md)
- [繁體中文 (香港) [zh-Hant-HK]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-HK.md)
- [繁體中文 (台灣) [zh-Hant-TW]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-TW.md)
- [English [en]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-en.md)
- [Français [fr]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-fr.md)
- Español [es] # actual
- [日本語 [ja]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ja.md)
- [한국어 [ko]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ko.md)
- [Русский [ru]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ru.md)
- [العربية [ar]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ar.md)

******

### Introduccion

******

El complemento AutoJs6 ML Kit OCR proporciona a AutoJs6 reconocimiento de texto chino basado en Google ML Kit. Puede devolver lineas de texto reconocidas, valores de confianza y cuadros delimitadores.

******

### Funciones

******

- Proporciona el servicio compartido de complemento OCR con ID de complemento `mlkit-ocr-chinese`, motor `mlkit-ocr` y variante `chinese`.
- Expone la interfaz OCR AIDL mediante `org.autojs.plugin.PADDLE_OCR` y funciona con el flujo de descubrimiento de complementos OCR del host AutoJs6.
- Admite `recognizeText` para listas de lineas de texto y `detect` para texto, confianza y limites de linea.
- Admite entrada de imagen codificada y entrada de bufer de imagen sin procesar `ARGB_8888`.
- Los metadatos del complemento, las instrucciones de uso, README y CHANGELOG estan localizados en espanol/frances/ruso/arabe/japones/coreano/ingles/chino simplificado/chino tradicional de Hong Kong/chino tradicional de Taiwan.
- Basado en `com.google.mlkit:text-recognition-chinese`.

******

### Interfaz Del Complemento

******

El host puede descubrir e invocar el complemento con la siguiente identidad:

```text
action: org.autojs.plugin.PADDLE_OCR
engine: mlkit-ocr
variant: chinese
plugin id: mlkit-ocr-chinese
```

`recognizeText` devuelve una lista de cadenas; `detect` devuelve objetos de resultado OCR que contienen `text`, `confidence` y `bounds`.

******

### Historial De Versiones

******

# v1.0.0

###### 2026/07/16

* `Nuevo` Se agrego el servicio de complemento OCR chino de ML Kit con ID de complemento `mlkit-ocr-chinese`, motor `mlkit-ocr` y variante `chinese`
* `Nuevo` Se agrego descubrimiento e invocacion del host mediante la accion OCR AIDL compartida `org.autojs.plugin.PADDLE_OCR`
* `Nuevo` Se agregaron las interfaces `recognizeText` y `detect`, que devuelven texto reconocido, valores de confianza y limites de lineas de texto
* `Nuevo` Se agrego soporte para entrada de imagen codificada y buferes de imagen sin procesar `ARGB_8888`, con una ruta de lectura SharedMemory preferida en Android 13 y versiones posteriores
* `Nuevo` Se agregaron metadatos del complemento e instrucciones de uso localizados en espanol, frances, ruso, arabe, japones, coreano, ingles, chino simplificado, chino tradicional de Hong Kong y chino tradicional de Taiwan
* `Nuevo` Se agregaron fuentes JSON y generacion `.python/generate_markdown.py` para archivos README y CHANGELOG
* `Nuevo` Se agregaron compilaciones APK separadas por ABI para `arm64-v8a`, `armeabi-v7a`, `x86_64` y un APK `universal`
* `Nuevo` Los nombres de APK de publicacion ahora incluyen la version, la variante ABI y el resumen CRC32

##### Para mas historial de versiones

* [CHANGELOG-es.md](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.changelog/CHANGELOG-es.md)

******

### Compilacion

******

```powershell
.\gradlew.bat :app:assembleDebug
```

Compilacion Release:

```powershell
.\gradlew.bat :app:assembleRelease
```

Los parametros de compilacion vienen de `version.properties`; el SDK minimo actual es 24 y el SDK objetivo es 36.

******

### Estructura De Recursos

******

```text
.readme/lang_*.json
.changelog/lang_*.json
.python/generate_markdown.py
app/src/main/assets/doc/CHANGELOG-*.md
app/src/main/res/values-*/strings.xml
app/src/main/res/raw-*/plugin_instruction.md
```

`strings.xml` contiene descripciones localizadas del complemento; `plugin_instruction.md` contiene instrucciones de uso mostradas por el host. Los archivos README y CHANGELOG se generan desde fuentes JSON mediante `.python/generate_markdown.py`.

******

### Enlaces

******

- Documentacion de AutoJs6: https://docs.autojs6.com
- Documentacion de reconocimiento de texto de Google ML Kit: https://developers.google.com/ml-kit/vision/text-recognition/v2/android
