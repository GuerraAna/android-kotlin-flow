# android-kotlin-flow

App de estudo sobre **Kotlin Coroutines Flow** — como substituir LiveData/callbacks por `StateFlow`/`SharedFlow` na comunicação entre camadas.

## Objetivo

Demonstrar na prática coleta e emissão de Flow em `ViewModel` + `Activity`, com comparação ao modelo LiveData.

## Tecnologias

- Kotlin + Coroutines (`kotlinx-coroutines-android`)
- `lifecycle-viewmodel-ktx`, `lifecycle-livedata-ktx`
- AppCompat, Material, ConstraintLayout
- AGP 8.x / Gradle 8.0

## Pré-requisitos

- **JDK 17**
- Android SDK Platform **34** (compileSdk 34, minSdk 24)

## Como rodar

```bash
echo "sdk.dir=$HOME/Library/Android/sdk" > local.properties   # macOS
./gradlew assembleDebug
```

Ou abrir no Android Studio e executar `MainActivity` num emulador/dispositivo.
