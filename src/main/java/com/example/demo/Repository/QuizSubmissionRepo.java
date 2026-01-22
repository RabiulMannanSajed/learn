package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Entity.QuizSubmission;

public interface QuizSubmissionRepo extends MongoRepository<QuizSubmission, String> {

    List<QuizSubmission> findByStudentId(String studentId);

    List<QuizSubmission> findByLessonIdAndStudentId(String lessonId, String studentId);
}
