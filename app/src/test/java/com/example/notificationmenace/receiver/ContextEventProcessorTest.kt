package com.example.notificationmenace.receiver

import org.junit.Test
import org.junit.Assert.*

class ContextEventProcessorTest {

    @Test
    fun handleEvent_userPresent_triggersUnlockAction() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }
        
        processor.process("android.intent.action.USER_PRESENT")
        
        assertEquals("trigger_unlock", triggeredAction)
    }

    @Test
    fun handleEvent_powerConnected_triggersPowerAction() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }

        processor.process("android.intent.action.ACTION_POWER_CONNECTED")

        assertEquals("trigger_power_connected", triggeredAction)
    }

    @Test
    fun handleEvent_powerDisconnected_triggersPowerAction() {
        var triggeredAction = ""
        val processor = ContextEventProcessor { action ->
            triggeredAction = action
        }

        processor.process("android.intent.action.ACTION_POWER_DISCONNECTED")

        assertEquals("trigger_power_disconnected", triggeredAction)
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
}
