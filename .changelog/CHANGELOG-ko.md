******

### 릴리스 기록

******

# v1.0.0

###### 2026/07/16

* `추가` ML Kit 중국어 OCR 플러그인 서비스를 추가했습니다. 플러그인 ID 는 `mlkit-ocr-chinese`, 엔진은 `mlkit-ocr`, 변형은 `chinese` 입니다
* `추가` 공유 OCR AIDL action `org.autojs.plugin.PADDLE_OCR` 를 통한 호스트 검색과 호출을 추가했습니다
* `추가` `recognizeText` 와 `detect` 인터페이스를 추가했습니다. 인식 텍스트, 신뢰도, 텍스트 줄 경계 상자를 반환합니다
* `추가` 인코딩된 이미지 입력과 `ARGB_8888` 원시 이미지 버퍼 입력을 추가했습니다. Android 13 이상에서는 SharedMemory 읽기 경로를 우선 시도합니다
* `추가` 플러그인 정보와 사용 설명의 다국어 리소스를 추가했습니다: 스페인어/프랑스어/러시아어/아랍어/일본어/한국어/영어/중국어 간체/홍콩 번체 중국어/대만 번체 중국어
* `추가` README 와 CHANGELOG 용 JSON 소스와 `.python/generate_markdown.py` 생성 흐름을 추가했습니다
* `추가` `arm64-v8a`/`armeabi-v7a`/`x86_64` 와 `universal` APK 의 ABI 분할 빌드를 추가했습니다
* `추가` 릴리스 APK 파일 이름에 버전, ABI 변형, CRC32 다이제스트를 포함했습니다
