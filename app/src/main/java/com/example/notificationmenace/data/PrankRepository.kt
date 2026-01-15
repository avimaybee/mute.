package com.example.notificationmenace.data

class PrankRepository {

    private val pranks = listOf(
        Prank(
            id = 1,
            type = PrankType.BARNUM,
            senderName = "Mute",
            messageBody = "I noticed you've been thinking about that thing... you know the one 🤔",
            punchlineText = "Interesting choice opening your phone right now. Very interesting."
        ),
        Prank(
            id = 2,
            type = PrankType.URGENCY,
            senderName = "System Update",
            messageBody = "BREAKING: Your attention is required for something completely unimportant",
            punchlineText = "Update Required: Your sense of humor needs a patch"
        ),
        Prank(
            id = 3,
            type = PrankType.ABSURD,
            senderName = "Mute",
            messageBody = "Touch your nose three times. Science reasons.",
            punchlineText = "Say 'pineapple pizza is valid' out loud. Do it."
        ),
        Prank(
            id = 4,
            type = PrankType.ROAST,
            senderName = "Mute",
            messageBody = "Still scrolling? The content won't get better, bestie 😅",
            punchlineText = "I see you're procrastinating. I respect it, actually."
        )
    )

    fun getRandomPrank(): Prank {
        return pranks.random()
    }

    fun getPrankById(id: Int): Prank? {
        return pranks.find { it.id == id }
    }
}
