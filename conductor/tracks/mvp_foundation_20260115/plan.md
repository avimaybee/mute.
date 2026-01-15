# Implementation Plan - Track: Establish MVP Foundation

## Phase 1: Project Skeleton & Architecture
- [x] Task: Set up Android project structure (MVVM, Hilt/Koin if needed, ViewBinding/Compose).
- [x] Task: specific dependency configuration (libs.versions.toml) for WorkManager, Navigation, and Room/Gson.
- [x] Task: Create base Activity and Application classes.
- [x] Task: Implement a basic "Theme" following the "Invisible Chaos" guidelines (Material 3, minimalist).

## Phase 2: Core Notification Engine
- [x] Task: Create the `PrankRepository` to manage the list of 150+ static prank messages.
    - [x] Sub-task: Define the data model for a `Prank` (id, type, senderName, messageBody, punchlineText).
    - [x] Sub-task: Populate the initial list of pranks (JSON or hardcoded list).
- [x] Task: Implement `PrankWorker` using `WorkManager`.
    - [x] Sub-task: Write logic to select a random prank.
    - [x] Sub-task: Write logic to schedule the next execution based on user frequency settings.
- [x] Task: Implement `NotificationManagerHelper` to actually post the notification.
    - [x] Sub-task: Configure the Notification Channel ("Mute Pranks").
    - [x] Sub-task: Ensure the `PendingIntent` points to the `GotchaActivity`.

## Phase 3: UI Implementation
- [x] Task: Implement `MainActivity` (Home Screen).
    - [x] Sub-task: Display current status (Active/Paused).
    - [x] Sub-task: Add a "Test Notification" button for immediate verification.
- [x] Task: Implement `GotchaActivity`.
    - [x] Sub-task: Create the layout (fullscreen, centered bold text, "Share" button placeholder).
    - [x] Sub-task: Extract the prank data from the Intent and display it.
- [x] Task: Implement `SettingsActivity` (or Fragment).
    - [x] Sub-task: Add controls for Frequency (Slider) and Quiet Hours (TimePickers).
    - [x] Sub-task: Persist settings using `DataStore` or `SharedPreferences`.

## Phase 4: Integration & Polish
- [x] Task: Wire up the `Settings` to the `PrankWorker` (reschedule on change).
- [x] Task: specific permission handling for `POST_NOTIFICATIONS` (Android 13+).
- [x] Task: Verify the "Invisible Chaos" aesthetic across all implemented screens.