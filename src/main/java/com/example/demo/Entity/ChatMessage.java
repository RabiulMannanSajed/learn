package com.example.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chat_messages") // MongoDB collection
public class ChatMessage {

    @Id
    private String id;
    private String sender;
    private String content;
    private String receiver; // <-- add here

    public ChatMessage() {}

    public ChatMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
     this.receiver = receiver; // <-- add here

    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

 public String getReceiver() { return receiver; } // <-- add getter
    public void setReceiver(String receiver) { this.receiver = receiver; } // <-- add setter
}
