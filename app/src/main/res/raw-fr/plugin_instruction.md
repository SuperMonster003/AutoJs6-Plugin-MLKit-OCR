ML Kit OCR (Chinese) fournit la reconnaissance de texte chinois via l interface de plugin OCR partagee d AutoJs6.

Identite du plugin:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`

Le plugin utilise la reconnaissance de texte chinois Google ML Kit. `recognizeText` renvoie les lignes de texte reconnues, et `detect` renvoie le texte, la confiance et les limites de ligne.

Il accepte les images encodees et les tampons d image bruts `ARGB_8888` transmis par l hote.
