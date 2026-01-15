# Implementation Plan - Track: Establish MVP Foundation

## Phase 1: Project Skeleton & Architecture
- [x] Task: Set up Android project structure (MVVM, Hilt/Koin if needed, ViewBinding/Compose).
- [x] Task: specific dependency configuration (libs.versions.toml) for WorkManager, Navigation, and Room/Gson.
- [x] Task: Create base Activity and Application classes.
- [x] Task: Implement a basic "Theme" following the "Invisible Chaos" guidelines (Material 3, minimalist).

## Phase 2: Core Notification Engine
- [ ] Task: Create the `PrankRepository` to manage the list of 150+ static prank messages.
    - [ ] Sub-task: Define the data model for a `Prank` (id, type, senderName, messageBody, punchlineText).
    - [ ] Sub-task: Populate the initial list of pranks (JSON or hardcoded list).
- [ ] Task: Implement `PrankWorker` using `WorkManager`.
    - [ ] Sub-task: Write logic to select a random prank.
    - [ ] Sub-task: Write logic to schedule the next execution based on user frequency settings.
- [ ] Task: Implement `NotificationManagerHelper` to actually post the notification.
    - [ ] Sub-task: Configure the Notification Channel ("Mute Pranks").
    - [ ] Sub-task: Ensure the `PendingIntent` points to the `GotchaActivity`.

## Phase 3: UI Implementation
- [ ] Task: Implement `MainActivity` (Home Screen).
    - [ ] Sub-task: Display current status (Active/Paused).
    - [ ] Sub-task: Add a "Test Notification" button for immediate verification.
- [ ] Task: Implement `GotchaActivity`.
    - [ ] Sub-task: Create the layout (fullscreen, centered bold text, "Share" button placeholder).
    - [ ] Sub-task: Extract the prank data from the Intent and display it.
- [ ] Task: Implement `SettingsActivity` (or Fragment).
    - [ ] Sub-task: Add controls for Frequency (Slider) and Quiet Hours (TimePickers).
    - [ ] Sub-task: Persist settings using `DataStore` or `SharedPreferences`.

## Phase 4: Integration & Polish
- [ ] Task: Wire up the `Settings` to the `PrankWorker` (reschedule on change).
- [ ] Task: specific permission handling for `POST_NOTIFICATIONS` (Android 13+).
- [ ] Task: Verify the "Invisible Chaos" aesthetic across all implemented screens.