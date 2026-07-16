# v1.0.0

###### 2026/07/16

* `Nouveau` Ajout du service de plugin OCR chinois ML Kit avec l ID de plugin `mlkit-ocr-chinese`, le moteur `mlkit-ocr` et la variante `chinese`
* `Nouveau` Ajout de la decouverte et de l appel par l action OCR AIDL partagee `org.autojs.plugin.PADDLE_OCR`
* `Nouveau` Ajout des interfaces `recognizeText` et `detect`, qui renvoient le texte reconnu, les valeurs de confiance et les limites des lignes de texte
* `Nouveau` Ajout de la prise en charge des images encodees et des tampons d image bruts `ARGB_8888`, avec lecture SharedMemory privilegiee sur Android 13 et versions ulterieures
* `Nouveau` Ajout des metadonnees de plugin et instructions d utilisation localisees en espagnol, francais, russe, arabe, japonais, coreen, anglais, chinois simplifie, chinois traditionnel de Hong Kong et chinois traditionnel de Taiwan
* `Nouveau` Ajout des sources JSON et de la generation `.python/generate_markdown.py` pour les fichiers README et CHANGELOG
* `Nouveau` Ajout des APK separes par ABI pour `arm64-v8a`, `armeabi-v7a`, `x86_64` et un APK `universal`
* `Nouveau` Les noms des APK de publication incluent maintenant la version, la variante ABI et le resume CRC32
