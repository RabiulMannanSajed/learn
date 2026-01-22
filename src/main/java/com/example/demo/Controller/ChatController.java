package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.ChatMessage;
import com.example.demo.Repository.ChatRepo;

@RestController
@CrossOrigin(origins = "*")
// * here we set the api end points
@RequestMapping("api/v1/chat")
public class ChatController {

    @Autowired
    private ChatRepo chatRepo;

    // Test endpoint
    @GetMapping("/test")
    public String test() {
        return "Chat controller working";
    }

    // Send message (POST)
    @PostMapping("/send")
    public ChatMessage sendMessage(@RequestBody ChatMessage message) {
        return chatRepo.save(message); // save in MongoDB
    }

    // Get all messages
    @GetMapping("/all")
    public List<ChatMessage> getAllMessages() {
        return chatRepo.findAll();
    }

    // Delete a message
    @DeleteMapping("/delete/{id}")
    public void deleteMessage(@PathVariable String id) {
        chatRepo.deleteById(id);
    }
}
