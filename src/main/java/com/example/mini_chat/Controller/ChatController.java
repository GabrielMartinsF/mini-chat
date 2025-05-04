package com.example.mini_chat.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.mini_chat.Model.ChatMessage;

@Controller
public class ChatController {

    @MessageMapping("/chat") // Endereço que o frontend vai enviar as mensagens
    @SendTo("/topic/messages") // Endereço para o qual as mensagens vão ser enviadas
    public ChatMessage send(ChatMessage message) {
        return message;
    }
}