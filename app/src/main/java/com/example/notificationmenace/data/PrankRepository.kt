package com.example.notificationmenace.data

object PrankRepository {

    private val pranks = mutableListOf(
        Prank(
            id = 1,
            type = PrankType.BARNUM,
            senderName = "Mute",
            messageBody = "I noticed you've been thinking about that thing... you know the one 🤔",
            punchlineText = "Interesting choice opening your phone right now. Very interesting.",
            tags = listOf(ContextTrigger.GENERAL)
        ),
        Prank(
            id = 2,
            type = PrankType.URGENCY,
            senderName = "System Update",
            messageBody = "BREAKING: Your attention is required for something completely unimportant",
            punchlineText = "Update Required: Your sense of humor needs a patch",
            tags = listOf(ContextTrigger.GENERAL)
        ),
        Prank(
            id = 3,
            type = PrankType.ABSURD,
            senderName = "Mute",
            messageBody = "Touch your nose three times. Science reasons.",
            punchlineText = "Say 'pineapple pizza is valid' out loud. Do it.",
            tags = listOf(ContextTrigger.GENERAL)
        ),
        Prank(
            id = 4,
            type = PrankType.ROAST,
            senderName = "Mute",
            messageBody = "Still scrolling? The content won't get better, bestie 😅",
            punchlineText = "I see you're procrastinating. I respect it, actually.",
            tags = listOf(ContextTrigger.DOOMSCROLLING, ContextTrigger.GENERAL)
        ),
        Prank(
            id = 5,
            type = PrankType.ROAST,
            senderName = "Power Manager",
            messageBody = "Feed me. I'm dying.",
            punchlineText = "15% battery? You live on the edge.",
            tags = listOf(ContextTrigger.BATTERY_LOW)
        ),
        Prank(
            id = 6,
            type = PrankType.ABSURD,
            senderName = "WiFi Spirit",
            messageBody = "I feel... disconnected.",
            punchlineText = "Did you just switch to data? Bold move.",
            tags = listOf(ContextTrigger.WIFI_DISCONNECTED)
        ),
        Prank(
            id = 7,
            type = PrankType.ROAST,
            senderName = "Mute",
            messageBody = "Oh, you plugged me in? Thanks, I guess.",
            punchlineText = "Now I have the energy to annoy you more.",
            tags = listOf(ContextTrigger.BATTERY_CHARGING)
        ),
        // --- NEW CONTENT BATCH 1 ---
        // GENERAL / UNLOCK
        Prank(8, PrankType.ABSURD, "Mute", "Don't look behind you.", "Made you look. 🤡", listOf(ContextTrigger.GENERAL)),
        Prank(9, PrankType.ROAST, "Screen Time Police", "Again? Really?", "You just locked it 5 seconds ago.", listOf(ContextTrigger.GENERAL)),
        Prank(10, PrankType.BARNUM, "Horoscope", "Your vibe is off today.", "I'm sensing a strong urge to scroll mindlessly.", listOf(ContextTrigger.GENERAL)),
        Prank(11, PrankType.ABSURD, "FBI Agent", "Nice outfit.", "Just kidding, cover your front camera.", listOf(ContextTrigger.GENERAL)),
        Prank(12, PrankType.URGENCY, "Bank Alert", "Transaction Approved: $4,000.00 for 'Clown Wig'", "Jk, but imagine if it was real.", listOf(ContextTrigger.GENERAL)),
        Prank(13, PrankType.ROAST, "Mute", "Go touch grass.", "I can see your reflection. You look tired.", listOf(ContextTrigger.GENERAL)),
        Prank(14, PrankType.ABSURD, "Mute", "I hid a pixel somewhere on your screen.", "Good luck finding it.", listOf(ContextTrigger.GENERAL)),
        Prank(15, PrankType.BARNUM, "Fortune Cookie", "You will read a pointless notification soon.", "Prophecy fulfilled.", listOf(ContextTrigger.GENERAL)),
        Prank(16, PrankType.URGENCY, "Storage Warning", "99% of storage used by 'Embarrassing Photos'", "Delete them. You know which ones.", listOf(ContextTrigger.GENERAL)),
        Prank(17, PrankType.ROAST, "Productivity", "This notification could have been an email.", "And you could have been working.", listOf(ContextTrigger.GENERAL)),
        Prank(18, PrankType.ABSURD, "Mute", "The simulation is glitching.", "Do not acknowledge the birds.", listOf(ContextTrigger.GENERAL)),
        Prank(19, PrankType.ROAST, "Mute", "Your thumb must be so strong.", "From all that scrolling. Olympic level.", listOf(ContextTrigger.GENERAL)),
        
        // BATTERY LOW
        Prank(20, PrankType.URGENCY, "Battery", "I see the light... 💀", "Charger. Now. Or I delete your contacts.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(21, PrankType.ROAST, "Mute", "Living dangerously, are we?", "1% is not a lifestyle choice.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(22, PrankType.ABSURD, "Energy Saver", "Dimming screen to 0%...", "Jk, but seriously, plug me in.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(23, PrankType.ROAST, "Mute", "I'm hungry.", "Electrons. I need electrons.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(24, PrankType.URGENCY, "System", "Shutdown Imminent in 3... 2...", "1... Just kidding. But you're close.", listOf(ContextTrigger.BATTERY_LOW)),

        // CHARGING
        Prank(25, PrankType.ABSURD, "Mute", "UNLIMITED POWER!!!", "I feel the electricity in my veins.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(26, PrankType.ROAST, "Mute", "Finally.", "Was about to call CPS (Cell Phone Services).", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(27, PrankType.ABSURD, "Battery", "Glug glug glug.", "That's the sound of me drinking electricity.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(28, PrankType.URGENCY, "Fast Charge", "Charging at supersonic speed.", "Phone may explode. (Not really).", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(29, PrankType.ROAST, "Mute", "Tethered to the wall again?", "Like a dog on a leash.", listOf(ContextTrigger.BATTERY_CHARGING)),

        // WIFI DISCONNECTED
        Prank(30, PrankType.URGENCY, "Data Plan", "There goes your data cap.", "Streaming 4K video on 5G? Bold.", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(31, PrankType.ABSURD, "Internet", "Hello? Can you hear me?", "I'm breaking up... static noise...", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(32, PrankType.ROAST, "Mute", "You're offline.", "Maybe talk to a real person?", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(33, PrankType.URGENCY, "Carrier", "Overage charges applied.", "$50 has been deducted. Jk.", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(34, PrankType.ABSURD, "Mute", "Welcome to the Stone Age.", "No WiFi? How will you survive?", listOf(ContextTrigger.WIFI_DISCONNECTED))
    )

    private val shownHistory = mutableListOf<Int>()
    private const val MAX_HISTORY_SIZE = 10

    fun getRandomPrank(): Prank {
        return pranks.random()
    }

    fun getPrankById(id: Int): Prank? {
        return pranks.find { it.id == id }
    }

    fun getPrankForTrigger(trigger: ContextTrigger): Prank {
        val candidates = pranks.filter { it.tags.contains(trigger) }
        
        // Filter out recently shown pranks
        val validCandidates = candidates.filter { !shownHistory.contains(it.id) }
        
        val selectedPrank = if (validCandidates.isNotEmpty()) {
            validCandidates.random()
        } else {
            // If all candidates for this trigger have been shown recently,
            // we have two options: 
            // 1. Pick a random one from the full candidate list (ignoring history)
            // 2. Clear history for these IDs and pick one.
            // Let's go with option 1 to keep it simple but ensure we always return something relevant.
            if (candidates.isNotEmpty()) {
                candidates.random()
            } else {
                 // Fallback to general if no specific prank found at all
                pranks.filter { it.tags.contains(ContextTrigger.GENERAL) }.random()
            }
        }
        
        addToHistory(selectedPrank.id)
        return selectedPrank
    }

    fun addPranks(newPranks: List<Prank>) {
        pranks.addAll(newPranks)
    }

    private fun addToHistory(id: Int) {
        shownHistory.add(id)
        if (shownHistory.size > MAX_HISTORY_SIZE) {
            shownHistory.removeAt(0) // Remove oldest
        }
    }

    fun clearHistory() {
        shownHistory.clear()
    }
}