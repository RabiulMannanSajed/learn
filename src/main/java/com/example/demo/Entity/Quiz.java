package com.example.demo.Entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

    
@Document(collection = "quizzes")
public class Quiz {

    @Id
    private String id;
    private String lessonId; // optional: link quiz to a lesson
    private String question;
    private List<String> options; // 4 options
    private int correctOptionIndex; // 0-3 index of correct option

    public Quiz() {}

    public Quiz(String lessonId, String question, List<String> options, int correctOptionIndex) {
        this.lessonId = lessonId;
        this.question = question;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getId() {
        return id;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public void setCorrectOptionIndex(int correctOptionIndex) {
        this.correctOptionIndex = correctOptionIndex;
    }
}
