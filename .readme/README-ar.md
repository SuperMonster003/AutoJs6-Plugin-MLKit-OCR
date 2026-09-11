<!--suppress HtmlDeprecatedAttribute, HttpUrlsUsage -->

<div align="center">
  <p>
    <picture>
      <source srcset="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap-night/ic_launcher.png?raw=true" media="(prefers-color-scheme: dark)" />
      <img src="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/res/mipmap/ic_launcher.png?raw=true" alt="autojs6-plugin-mlkit-ocr-ic-launcher" border="0" width="128" />
    </picture>
  </p>

  <p>التعرف على النصوص الصينية باستخدام Google ML Kit</p>

  <p>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/releases"><img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?label=Release"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/issues"><img alt="GitHub closed issues" src="https://img.shields.io/github/issues/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=A24232&label=Issues"/></a>
    <a href="https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/LICENSE"><img alt="GitHub License" src="https://img.shields.io/github/license/SuperMonster003/AutoJs6-Plugin-MLKit-OCR?color=534BAE&label=License"/></a>
  </p>
</div>

******

### اللغات

******

يدعم README.md الحالي اللغات التالية:

- [简体中文 [zh-Hans]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hans.md)
- [繁體中文 (香港) [zh-Hant-HK]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-HK.md)
- [繁體中文 (台灣) [zh-Hant-TW]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-zh-Hant-TW.md)
- [English [en]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-en.md)
- [Français [fr]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-fr.md)
- [Español [es]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-es.md)
- [日本語 [ja]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ja.md)
- [한국어 [ko]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ko.md)
- [Русский [ru]](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/.readme/README-ru.md)
- العربية [ar] # الحالي

******

### مقدمة

******

يوفر مكون AutoJs6 ML Kit OCR الإضافي تعرفا على النص الصيني في AutoJs6 اعتمادا على Google ML Kit. يمكنه إرجاع أسطر النص المتعرف عليها, وقيم الثقة, ومربعات الحدود.

******

### الميزات

******

- يوفر خدمة مكون OCR إضافي مشتركة بمعرف `mlkit-ocr-chinese`, ومحرك `mlkit-ocr`, ومتغير `chinese`.
- يعرض واجهة OCR AIDL عبر `org.autojs.plugin.PADDLE_OCR` ويعمل مع مسار اكتشاف مكونات OCR الإضافية في مضيف AutoJs6.
- يدعم `recognizeText` لقوائم أسطر النص و `detect` للنص, والثقة, وحدود السطر.
- يدعم إدخال الصور المشفرة وإدخال مخزن صور خام `ARGB_8888`.
- تمت ترجمة بيانات المكون الإضافي, وتعليمات الاستخدام, و README, و CHANGELOG إلى الإسبانية/الفرنسية/الروسية/العربية/اليابانية/الكورية/الإنجليزية/الصينية المبسطة/الصينية التقليدية لهونغ كونغ/الصينية التقليدية لتايوان.
- مبني على `com.google.mlkit:text-recognition-chinese`.

******

### واجهة المكون الإضافي

******

يمكن للمضيف اكتشاف المكون الإضافي واستدعاؤه بالهوية التالية:

```text
action: org.autojs.plugin.PADDLE_OCR
engine: mlkit-ocr
variant: chinese
plugin id: mlkit-ocr-chinese
```

يعيد `recognizeText` قائمة سلاسل; ويعيد `detect` كائنات نتيجة OCR تحتوي على `text`, و `confidence`, و `bounds`.

******

### تاريخ الإصدارات

******

# v1.0.1

###### 2026/09/11

* `تحسين` التحقق أثناء البناء من محاذاة صفحات 16 KB للمكتبات الأصلية ذات 64 بت, مع فحص عقد manifest وتقارير JSON

# v1.0.0

###### 2026/09/01

* `جديد` تمت إضافة خدمة مكون ML Kit OCR الصيني الإضافي بمعرف `mlkit-ocr-chinese`, ومحرك `mlkit-ocr`, ومتغير `chinese`
* `جديد` تمت إضافة اكتشاف المضيف والاستدعاء عبر إجراء OCR AIDL المشترك `org.autojs.plugin.PADDLE_OCR`
* `جديد` تمت إضافة واجهتي `recognizeText` و `detect`, اللتين تعيدان النص المتعرف عليه, وقيم الثقة, وحدود أسطر النص
* `جديد` تمت إضافة دعم إدخال الصور المشفرة ومخازن الصور الخام `ARGB_8888`, مع تفضيل مسار قراءة SharedMemory على Android 13 والإصدارات الأحدث
* `جديد` تمت إضافة بيانات المكون الإضافي وتعليمات الاستخدام المحلية للإسبانية والفرنسية والروسية والعربية واليابانية والكورية والإنجليزية والصينية المبسطة والصينية التقليدية لهونغ كونغ والصينية التقليدية لتايوان
* `جديد` تمت إضافة مصادر JSON وتوليد `.python/generate_markdown.py` لملفات README و CHANGELOG
* `جديد` تمت إضافة حزم APK مقسمة حسب ABI لـ `arm64-v8a`, و `armeabi-v7a`, و `x86_64`, وحزمة APK `universal`
* `جديد` أسماء ملفات APK للإصدار تتضمن الآن الإصدار, ومتغير ABI, وملخص CRC32
* `تحسين` توحيد تخطيط README وطريقة إدارة إصدارات منصة Gradle
* `تحسين` تبسيط وصف المكون الإضافي وتوحيد علامات الترقيم في الموارد متعددة اللغات

##### لمزيد من تاريخ الإصدارات

* [CHANGELOG-ar.md](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/app/src/main/assets/doc/CHANGELOG-ar.md)

******

### البناء

******

```powershell
.\gradlew.bat :app:assembleDebug
```

بناء Release:

```powershell
.\gradlew.bat :app:assembleRelease
```

تأتي معلمات البناء من `version.properties`; الحد الأدنى الحالي من SDK هو 24 و SDK الهدف هو 36.

******

### بنية الموارد

******

```text
.readme/lang_*.json
.changelog/lang_*.json
.python/generate_markdown.py
app/src/main/assets/doc/CHANGELOG-*.md
app/src/main/res/values-*/strings.xml
app/src/main/res/raw-*/plugin_instruction.md
```

يحتوي `strings.xml` على أوصاف محلية للمكون الإضافي; ويحتوي `plugin_instruction.md` على تعليمات الاستخدام التي يعرضها المضيف. يتم إنشاء README و CHANGELOG من مصادر JSON بواسطة `.python/generate_markdown.py`.

******

### روابط

******

- وثائق AutoJs6: https://docs.autojs6.com
- وثائق التعرف على النص في Google ML Kit: https://developers.google.com/ml-kit/vision/text-recognition/v2/android


[16 KB page alignment and build verification](https://github.com/SuperMonster003/AutoJs6-Plugin-MLKit-OCR/blob/master/docs/16kb.md)
