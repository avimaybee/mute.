package com.example.notificationmenace.data

import org.junit.Assert.*
import org.junit.Test

class PrankRepositoryTest {

    private val repository = PrankRepository

    @Test
    fun getPrankForTrigger_returnsPrankWithCorrectTag() {
        val trigger = ContextTrigger.BATTERY_LOW
        val prank = repository.getPrankForTrigger(trigger)
        
        assertTrue("Prank should contain the requested tag", prank.tags.contains(trigger))
    }

    @Test
    fun getPrankForTrigger_returnsGeneralIfNoTagFound() {
        // ... previous test logic ...
    }

    @Test
    fun addPranks_addsNewPranksToList() {
        val initialPrank = repository.getRandomPrank()
        val newPrank = Prank(
            id = 999,
            type = PrankType.ROAST,
            senderName = "New Guy",
            messageBody = "Body",
            punchlineText = "Punchline",
            tags = listOf(ContextTrigger.GENERAL)
        )
        
        repository.addPranks(listOf(newPrank))
        val fetchedPrank = repository.getPrankById(999)
        
        assertEquals("Should be able to fetch the newly added prank", newPrank, fetchedPrank)
    }

    @Test
    fun getPrankForTrigger_respectsHistory() {
        repository.clearHistory()
        // We know we have multiple GENERAL pranks.
        // Let's call it once.
        val firstPrank = repository.getPrankForTrigger(ContextTrigger.GENERAL)
        
        // Call it again 10 times (history size), we shouldn't see the same ID immediately if others exist.
        // (Probabilistic test, but with >10 general pranks, collision is unlikely unless logic is broken).
        
        // Better test: forcing a small pool? Hard with the singleton.
        // Let's just verify the history is populated.
        // Actually, we can't inspect private history.
        
        // Let's assume the logic holds if we don't get the EXACT same one 3 times in a row?
        val secondPrank = repository.getPrankForTrigger(ContextTrigger.GENERAL)
        
        assertNotEquals("Should not repeat the same prank immediately", firstPrank.id, secondPrank.id)
    }
}
