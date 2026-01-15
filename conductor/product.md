# Product Definition: Mute

## Vision
Mute is a self-aware, chaotic digital sidekick designed to break the monotony of modern smartphone usage. It delivers spontaneous humor through personalized roasts and absurd alerts, acting as a mischievous companion that keeps users on their toes.

## Target Audience
- **Primary Persona:** "Chaos Enjoyer Chris" (Age 18-28). Active on TikTok/Reddit, meme-savvy, and seeks novelty to break their daily phone routine.

## Core Goals
1. **Break Monotony:** Inject spontaneous humor into routine phone interactions.
2. **Companion Experience:** Create a unique relationship where "Mute" roasts and reacts to the user.
3. **Virality:** Facilitate high-quality, shareable "Gotcha!" moments optimized for social media.

## Personality & Tone
Mute's voice is a blend of:
- **Sarcastic & Roasty:** Poking fun at phone habits and procrastination.
- **Absurd & Surreal:** Delivering random commands and nonsensical observations.
- **Mischievous:** Engaging in playful, harmless pranks that stay within ethical boundaries.

## MVP Key Features
- **Notification Engine:** 150+ text-based pranks categorized by type (Barnum observations, fake urgencies, roasts).
- **Smart Scheduling:** Reliable background delivery using WorkManager with user-adjustable frequency and quiet hours.
- **Transparency:** Clear branding to ensure users always know notifications are from Mute, avoiding actual deception.

## Critical Constraints
- **Efficiency:** Must maintain extremely low battery drain (<0.5% daily) and minimal performance footprint.
- **Compliance:** Strict adherence to platform policies regarding transparency and user control.

## Phase 2: Unpredictable Context Engine (The "Alive" Update)
### Goals
Transform "Mute" from a reactive, manual app into an unpredictable, context-aware companion.

### Features
1.  **Context Detection:**
    *   **Screen:** Detect unlock events (requires "Active Mode").
    *   **Battery:** React to charging and low battery (<15%).
    *   **Connectivity:** Adapt to offline/online states.
2.  **Hybrid Content:**
    *   **Local:** Evergreen pranks for offline use.
    *   **Remote:** Daily fetch of "Brainrot" content from remote JSON.
3.  **Smart Logic:**
    *   Context-tagged pranks (e.g., `#battery_low`).
    *   WorkManager for gap-filling during quiet hours.