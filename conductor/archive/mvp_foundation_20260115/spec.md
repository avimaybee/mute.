# Track Specification: Establish MVP Foundation

## Goal
To implement the core technical foundation of "Mute," enabling the scheduling and display of "real-feeling" prank notifications and a minimalist "Gotcha!" screen.

## Scope
1.  **Project Structure:** Confirm MVVM architecture and dependency injection setup.
2.  **Notification Engine:**
    -   Implement `WorkManager` for background scheduling.
    -   Create a local database (Room or static list) for the initial 150+ prank messages.
    -   Implement the logic to display notifications with "genuine" sender names and content.
3.  **UI Implementation:**
    -   **Home Screen:** Minimalist status screen (next prank timer, active status).
    -   **Gotcha! Activity:** The target destination of the notification intent. Stark, high-contrast text display.
    -   **Settings:** Basic controls for frequency and quiet hours.
4.  **Assets:** Import the single Mute logo and font (Inter/Roboto).

## Success Criteria
-   App installs and runs on Android API 26+.
-   User can schedule notifications (e.g., "Surprise Me" mode).
-   Notifications appear in the system tray looking "real."
-   Clicking a notification opens the "Gotcha!" screen with the correct message.
-   Battery usage remains negligible (verified via simple observation for now).