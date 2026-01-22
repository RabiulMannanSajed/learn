package com.example.demo.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "quiz_submissions")

public class QuizSubmission {
        @Id
    private String id;

    private String studentId;
    private String lessonId;
    private String quizId;

    private int selectedOption;
    private boolean correct;
    private int marks; // 1 or 0

    public QuizSubmission() {}

    public QuizSubmission(String studentId, String lessonId, String quizId,
                          int selectedOption, boolean correct, int marks) {
        this.studentId = studentId;
        this.lessonId = lessonId;
        this.quizId = quizId;
        this.selectedOption = selectedOption;
        this.correct = correct;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public int getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(int selectedOption) {
        this.selectedOption = selectedOption;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
