package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Entity.Quiz;

public interface QuizRepo extends MongoRepository<Quiz, String> {
    List<Quiz> findByLessonId(String lessonId); // get quizzes of a lesson
}
