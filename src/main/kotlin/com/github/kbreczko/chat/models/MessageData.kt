package com.github.kbreczko.chat.models

import java.time.LocalDateTime

data class MessageData(
        var user: String,
        var content: String,
        var timestamp: LocalDateTime
)