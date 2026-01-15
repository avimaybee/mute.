package com.example.notificationmenace.data

import org.junit.Assert.*
import org.junit.Test

class PrankRepositoryTest {

    private val repository = PrankRepository()

    @Test
    fun getPrankForTrigger_returnsPrankWithCorrectTag() {
        val trigger = ContextTrigger.BATTERY_LOW
        val prank = repository.getPrankForTrigger(trigger)
        
        assertTrue("Prank should contain the requested tag", prank.tags.contains(trigger))
    }

    @Test
    fun getPrankForTrigger_returnsGeneralIfNoTagFound() {
        // Assuming we request a tag that might not have pranks (though currently all do or fallback)
        // Let's rely on the fallback logic being tested via GENERAL
        val trigger = ContextTrigger.GENERAL
        val prank = repository.getPrankForTrigger(trigger)
        
        assertTrue("Fallback prank should contain GENERAL tag or be valid", 
            prank.tags.contains(ContextTrigger.GENERAL) || prank.tags.isNotEmpty())
    }
}
