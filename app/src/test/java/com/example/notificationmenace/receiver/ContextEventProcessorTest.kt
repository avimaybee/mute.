package com.example.notificationmenace.receiver

import android.content.Intent
import org.junit.Test
import org.junit.Assert.*

/**
 * Unit tests for ContextEventProcessor.
 * Note: Tests using Bundle require instrumentation tests or mocking.
 * These tests cover the basic action mapping functionality.
 */
class ContextEventProcessorTest {

    @Test
    fun handleEvent_userPresent_triggersUnlockAction() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }
        
        processor.process(Intent.ACTION_USER_PRESENT)
        
        assertEquals("screen_unlock", triggeredAction)
    }

    @Test
    fun handleEvent_screenOn_triggersScreenOnAction() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }

        processor.process(Intent.ACTION_SCREEN_ON)

        assertEquals("screen_on", triggeredAction)
    }

    @Test
    fun handleEvent_powerConnected_triggersBatteryChargingAction() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }

        processor.process(Intent.ACTION_POWER_CONNECTED)

        assertEquals("battery_charging", triggeredAction)
    }

    @Test
    fun handleEvent_powerDisconnected_triggersBatteryUnpluggedAction() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }

        processor.process(Intent.ACTION_POWER_DISCONNECTED)

        assertEquals("battery_unplugged", triggeredAction)
    }

    @Test
    fun handleEvent_batteryLow_triggersBatteryLowAction() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }

        processor.process(Intent.ACTION_BATTERY_LOW)

        assertEquals("battery_low", triggeredAction)
    }

    @Test
    fun handleEvent_batteryOkay_triggersBatteryOkayAction() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }

        processor.process(Intent.ACTION_BATTERY_OKAY)

        assertEquals("battery_okay", triggeredAction)
    }

    @Test
    fun handleEvent_bootCompleted_triggersBootAction() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }

        processor.process(Intent.ACTION_BOOT_COMPLETED)

        assertEquals("boot_completed", triggeredAction)
    }

    @Test
    fun handleEvent_unknownAction_doesNothing() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }

        processor.process("com.unknown.ACTION")

        assertEquals("", triggeredAction)
    }
    
    @Test
    fun handleEvent_nullAction_doesNothing() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }

        processor.process(null)

        assertEquals("", triggeredAction)
    }
}
