# Technology Stack: Mute

## Core Technologies
- **Language:** Kotlin
- **Platform:** Android (Target SDK 36, Min SDK 26)
- **Build System:** Gradle (KTS) with Version Catalog (`libs.versions.toml`)

## Architecture
- **Pattern:** MVVM (Model-View-ViewModel) with Repository pattern.
- **Components:** AndroidX Core, ViewModel, LiveData/Flow.

## Libraries & Frameworks
- **UI:** Material Components, AppCompat, ConstraintLayout.
- **Network:** Retrofit (or standard HttpURLConnection) + Gson.
- **Background Tasks:** WorkManager (for notification scheduling & Sync).
- **Context Monitoring:** BroadcastReceivers (System Events) + Periodic Polling.
- **Navigation:** Jetpack Navigation Component.
- **Testing:** JUnit 4, Espresso, AndroidX Test.

## Infrastructure
- **Backend:** GitHub Gist (JSON Store) for dynamic content.
- **Protocol:** Raw HTTP GET via `ContentSyncWorker`.
- **Analytics/Crashlytics:** Local `LogManager` (Persistent File I/O).
