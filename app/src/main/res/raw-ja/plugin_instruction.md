ML Kit OCR (Chinese) は AutoJs6 の共有 OCR プラグインインターフェイスを通じて中国語テキスト認識を提供します.

プラグイン識別情報:

- action: `org.autojs.plugin.PADDLE_OCR`
- engine: `mlkit-ocr`
- variant: `chinese`
- plugin id: `mlkit-ocr-chinese`

このプラグインは Google ML Kit 中国語テキスト認識を使用します. `recognizeText` は認識したテキスト行を返し, `detect` はテキスト, 信頼度, 行の境界ボックスを返します.

ホストからのエンコード済み画像入力と `ARGB_8888` 生画像バッファを受け付けます.
