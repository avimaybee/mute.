package com.example.notificationmenace.data

class PrankRepository {

    private val pranks = listOf(
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
        )
    )

    fun getRandomPrank(): Prank {
        return pranks.random()
    }

    fun getPrankById(id: Int): Prank? {
        return pranks.find { it.id == id }
    }

    fun getPrankForTrigger(trigger: ContextTrigger): Prank {
        val filtered = pranks.filter { it.tags.contains(trigger) }
        return if (filtered.isNotEmpty()) {
            filtered.random()
        } else {
            // Fallback to general if no specific prank found
            pranks.filter { it.tags.contains(ContextTrigger.GENERAL) }.random()
        }
    }
}