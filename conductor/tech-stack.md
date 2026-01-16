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
- **Background Tasks:** WorkManager (for notification scheduling).
- **Context Monitoring:** BroadcastReceivers (System Events).
- **Navigation:** Jetpack Navigation Component.
- **Testing:** JUnit 4, Espresso, AndroidX Test.

## Infrastructure
- **Analytics/Crashlytics:** Firebase (as per PRD).
- **Remote Config:** Firebase Remote Config (planned for Phase 3).
