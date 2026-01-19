package com.example.demo.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import com.example.demo.Entity.ChatMessage;

public class ChatController {
   
    @MessageMapping("/sendMessage") // Client sends to /app/sendMessage
    @SendTo("/topic/public")        // Server broadcasts to /topic/public
    public ChatMessage broadcastMessage(ChatMessage message) {
        return message; // send back to all clients
    } 
}
