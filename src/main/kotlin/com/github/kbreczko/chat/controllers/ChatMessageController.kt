package com.github.kbreczko.chat.controllers

import com.github.kbreczko.chat.models.forms.MessageForm
import com.github.kbreczko.chat.models.MessageData
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import java.time.LocalDateTime

@Controller
class ChatMessageController {

    @MessageMapping("/message")
    @SendTo("/chat")
    fun sendMessage(messageForm: MessageForm): MessageData {
        return MessageData(messageForm.user, messageForm.content, LocalDateTime.now())
    }
}