package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.Entity.ChatMessage;

public interface ChatRepo extends MongoRepository<ChatMessage, String> {}
