package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Quiz;
import com.example.demo.Repository.QuizRepo;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/lesson/{lessonId}/quiz")
public class QuizController {

    @Autowired
    private QuizRepo quizRepo;

    // Add quiz to a lesson
    @PostMapping("/add")
    public Quiz addQuiz(@PathVariable String lessonId, @RequestBody Quiz quiz) {
        quiz.setLessonId(lessonId);
        return quizRepo.save(quiz);
    }

    // Get all quizzes of a lesson
    @GetMapping("/all")
    public List<Quiz> getQuizzesByLesson(@PathVariable String lessonId) {
        return quizRepo.findByLessonId(lessonId);
    }

    // Student submits answer
    @PostMapping("/submit/{quizId}")
    public String submitAnswer(@PathVariable String lessonId,
                               @PathVariable String quizId,
                               @RequestParam int selectedOption) {
        Quiz quiz = quizRepo.findById(quizId).orElse(null);
        if (quiz == null || !quiz.getLessonId().equals(lessonId)) 
            return "Quiz not found for this lesson";

        if (selectedOption == quiz.getCorrectOptionIndex()) {
            return "Correct!";
        } else {
            return "Wrong! Correct answer is option " + (quiz.getCorrectOptionIndex() + 1);
        }
    }

    // Delete quiz
    @DeleteMapping("/delete/{quizId}")
    public void deleteQuiz(@PathVariable String lessonId, @PathVariable String quizId) {
        Quiz quiz = quizRepo.findById(quizId).orElse(null);
        if (quiz != null && quiz.getLessonId().equals(lessonId)) {
            quizRepo.deleteById(quizId);
        }
    }
}
