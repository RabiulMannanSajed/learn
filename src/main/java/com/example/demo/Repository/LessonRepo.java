package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Entity.Lesson;

public interface LessonRepo extends MongoRepository<Lesson, String> {
}
