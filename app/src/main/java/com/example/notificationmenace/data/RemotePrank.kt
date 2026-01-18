package com.example.notificationmenace.data

import com.google.gson.annotations.SerializedName

/**
 * Data class for parsing remote pranks from JSON.
 * Uses Gson annotations for flexible naming.
 */
data class RemotePrankResponse(
    @SerializedName("version") val version: Double,
    @SerializedName("lastUpdated") val lastUpdated: String,
    @SerializedName("pranks") val pranks: List<RemotePrank>
)

data class RemotePrank(
    @SerializedName("id") val id: Int,
    @SerializedName("type") val type: String,
    @SerializedName("senderName") val senderName: String,
    @SerializedName("messageBody") val messageBody: String,
    @SerializedName("punchlineText") val punchlineText: String,
    @SerializedName("tags") val tags: List<String>
) {
    /**
     * Converts this remote prank to the app's Prank model.
     */
    fun toPrank(): Prank {
        val prankType = try {
            PrankType.valueOf(type.uppercase())
        } catch (e: IllegalArgumentException) {
            PrankType.ROAST // Default fallback
        }
        
        val contextTriggers = tags.map { tag ->
            ContextTrigger.fromTag(tag)
        }
        
        return Prank(
            id = id,
            type = prankType,
            senderName = senderName,
            messageBody = messageBody,
            punchlineText = punchlineText,
            tags = contextTriggers
        )
    }
}
