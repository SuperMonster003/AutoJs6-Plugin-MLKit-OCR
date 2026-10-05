******

### Historique Des Versions

******

# v1.0.4

###### 2026/10/05

* `Amelioration` Les icônes du centre de plugins utilisent les tailles, positions, images claires et sombres et fonds circulaires réglés dans Icon Studio, avec les sources et paramètres permettant de les reproduire
* `Amelioration` Les icônes des informations d'application Android utilisent les illustrations et les fonds clairs et sombres d'Icon Studio, en conservant les images transparentes du centre de plugins et les choix du lanceur

# v1.0.3

###### 2026/09/19

* `Correctif` Avertissements de lecture SDK XML v4 avec AGP 9.1 et contrôles d'alignement natif des APK déclenchés par erreur lors de l'assemblage des tests unitaires JVM, avec les plugins de compilation partagés 1.8.3
* `Amelioration` compileSdk et targetSdk passent à 37 (Android 17) ; le comportement du plugin ne dépend pas de la nouvelle cible

# v1.0.2

###### 2026/09/13

* `Correctif` Les informations de version et d'ABI du centre des plugins correspondent à l'APK installé
* `Correctif` Les images encodées sont limitées à 64 MiB avec prise en charge des fichiers et des tubes
* `Correctif` Les dates de version utilisent un format anglais uniforme
* `Amelioration` Validation des versions, signatures et variantes complètes des APK avant la création des fichiers à télécharger
* `Amelioration` Les images peuvent contenir jusqu'à 16777216 pixels; les tampons bruts sont limités à 64 MiB
* `Amelioration` Étendre les ABI natives et les métadonnées du plugin à arm64-v8a, armeabi-v7a, x86 et x86_64, avec des APK universels et par ABI cohérents

# v1.0.1

###### 2026/09/11

* `Amelioration` Vérification à la compilation de l'alignement des pages de 16 KB des bibliothèques natives 64 bits, avec contrôle du contrat manifest et rapports JSON

# v1.0.0

###### 2026/09/01

* `Nouveau` Ajout du service de plugin OCR chinois ML Kit avec l ID de plugin `mlkit-ocr-chinese`, le moteur `mlkit-ocr` et la variante `chinese`
* `Nouveau` Ajout de la decouverte et de l appel par l action OCR AIDL partagee `org.autojs.plugin.PADDLE_OCR`
* `Nouveau` Ajout des interfaces `recognizeText` et `detect`, qui renvoient le texte reconnu, les valeurs de confiance et les limites des lignes de texte
* `Nouveau` Ajout de la prise en charge des images encodees et des tampons d image bruts `ARGB_8888`, avec lecture SharedMemory privilegiee sur Android 13 et versions ulterieures
* `Nouveau` Ajout des metadonnees de plugin et instructions d utilisation localisees en espagnol, francais, russe, arabe, japonais, coreen, anglais, chinois simplifie, chinois traditionnel de Hong Kong et chinois traditionnel de Taiwan
* `Nouveau` Ajout des sources JSON et de la generation `.python/generate_markdown.py` pour les fichiers README et CHANGELOG
* `Nouveau` Ajout des APK separes par ABI pour `arm64-v8a`, `armeabi-v7a`, `x86_64` et un APK `universal`
* `Nouveau` Les noms des APK de publication incluent maintenant la version, la variante ABI et le resume CRC32
* `Amelioration` Uniformiser la mise en page du README et la gestion des versions de la plateforme Gradle
* `Amelioration` Simplifier la description du plugin et normaliser la ponctuation des ressources multilingues
