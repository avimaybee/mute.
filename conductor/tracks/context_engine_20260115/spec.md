# Track Specification: Unpredictable Context Engine (The "Alive" Update)

## Overview
Transform "Mute" from a reactive, manual app into an unpredictable, context-aware companion. The app will "come alive" by monitoring system events and delivering timely, relevant roasts and observations based on the user's current device state (unlocked, battery level, connectivity, etc.), using a hybrid content model that mixes local fallback with remote AI-curated updates.

## Functional Requirements
1. **Context Detection Engine:**
    - Monitor **Screen Events:** Detect phone unlock/lock actions.
    - Monitor **Battery State:** React to charging, discharging, and low battery milestones (20%, 15%, 5%).
    - Monitor **Connectivity:** Detect WiFi/Data switches and signal loss.
    - Monitor **App Usage (Basic):** Track continuous screen-on time to trigger "doomscrolling" roasts.
2. **Hybrid Content Management:**
    - **Local Repository:** maintain a robust set of "evergreen" pranks for offline use.
    - **Remote Sync:** Implement a daily fetch mechanism to pull new, AI-generated/curated "Meme/Brainrot" content from a remote JSON source (e.g., Firebase or GitHub Raw).
    - **Context Tagging:** Map specific content to relevant triggers (e.g., `#battery_low`, `#screen_unlock`).
3. **Smart Scheduling Logic:**
    - **Trigger-Based:** Fire notifications immediately (or with a small random delay) when specific context events occur.
    - **Window-Based:** Use `WorkManager` to fill "quiet gaps" with unpredictable notifications during user-active hours.
4. **Offline Resilience:**
    - Ensure the "Context Engine" always has access to local content if the device is offline or the remote fetch fails.

## Non-Functional Requirements
- **Efficiency:** Use lightweight `BroadcastReceivers` and `WorkManager`. Target <0.5% additional battery drain.
- **Privacy/Trust:** Keep permissions to a minimum. Avoid requesting sensitive permissions (Location, Activity) unless absolutely critical for a specific high-value roast.
- **Minimalism:** Maintain the "Invisible Chaos" aesthetic—notifications must look like standard system alerts.

## Acceptance Criteria
- App sends a relevant notification within 30 seconds of a device unlock event.
- App sends a relevant roast when battery drops to a critical level (e.g., 15%).
- App successfully fetches and stores new content from a remote source when internet is available.
- Notifications are randomized and do not repeat excessively within a 24-hour period.

## Out of Scope
- Real-time on-device AI generation (using LLMs like Gemini Nano)—this will be handled by remote curation/generation for now.
- Detailed per-app usage tracking (requires high-level "Usage Stats" permission).