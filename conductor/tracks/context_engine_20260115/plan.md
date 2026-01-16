# Implementation Plan - Track: Unpredictable Context Engine

## Phase 1: Context Infrastructure & WorkManager Setup [checkpoint: be261dc]
- [x] Task: Create `ContextTrigger` data model to map system states to content tags.
- [x] Task: Implement `ContextMonitorWorker` using `WorkManager`.
    - [x] Sub-task: Set up a periodic background worker (every 15-30 mins) to poll "slow" contexts (Battery, WiFi state).
    - [x] Sub-task: Implement logic to check if a notification "should" fire based on recent triggers and frequency settings.
- [x] Task: Update `PrankRepository` to support context-based filtering and tagging.
- [x] Task: Conductor - User Manual Verification 'Phase 1: Context Infrastructure' (Protocol in workflow.md)

## Phase 2: Remote Content Sync (Hybrid Model)
- [x] Task: Implement `ContentSyncWorker` using `WorkManager`.
    - [x] Sub-task: Write logic to fetch a remote JSON manifest (Firebase/GitHub) once per day.
    - [x] Sub-task: Implement local caching (Room or SharedPreferences) for fetched AI/Curated content.
- [x] Task: Implement "Merge" logic to combine remote updates with local evergreen content.
- [ ] Task: Conductor - User Manual Verification 'Phase 2: Remote Content Sync' (Protocol in workflow.md)

## Phase 3: Event-Driven Triggers (Immediate Context)
- [x] Task: Implement `BroadcastReceivers` for high-impact "real-time" events. 232c5f0
    - [x] Sub-task: Monitor `ACTION_USER_PRESENT` (Unlock) and `ACTION_POWER_CONNECTED/DISCONNECTED`.
- [x] Task: Integrate `BroadcastReceivers` with `WorkManager` to trigger "One-Time" urgent prank work requests. 232c5f0
- [ ] Task: Conductor - User Manual Verification 'Phase 3: Event-Driven Triggers' (Protocol in workflow.md)

## Phase 4: Refinement & "Brainrot" Content Integration
- [ ] Task: Populate the `PrankRepository` with the first batch of contextual roasts (Battery, WiFi, Doomscrolling).
- [ ] Task: Implement a "Context History" tracker to prevent repetitive roasts for the same trigger.
- [ ] Task: Verify battery consumption remains within the <0.5% daily target using Battery Historian or similar tools.
- [ ] Task: Conductor - User Manual Verification 'Phase 4: Refinement' (Protocol in workflow.md)