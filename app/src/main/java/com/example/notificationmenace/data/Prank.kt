package com.example.notificationmenace.data

data class Prank(
    val id: Int,
    val type: PrankType,
    val senderName: String,
    val messageBody: String,
    val punchlineText: String
)

enum class PrankType {
    BARNUM,
    URGENCY,
    ABSURD,
    ROAST
}
