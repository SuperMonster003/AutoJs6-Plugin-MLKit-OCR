يوفر ML Kit OCR (Chinese) تعرفا على النص الصيني من خلال واجهة مكونات OCR الإضافية المشتركة في AutoJs6.

هوية المكون الإضافي:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`

يستخدم المكون الإضافي تعرف Google ML Kit على النص الصيني. يعيد `recognizeText` أسطر النص المتعرف عليها, ويعيد `detect` النص, والثقة, وحدود السطر.

يقبل إدخال الصور المشفرة ومخازن الصور الخام `ARGB_8888` من المضيف.
