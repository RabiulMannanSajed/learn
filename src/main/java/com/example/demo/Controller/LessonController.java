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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Lesson;
import com.example.demo.Repository.LessonRepo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/lesson")
public class LessonController {
    
    @Autowired
    private LessonRepo lessonRepo;

    // ✅ Add Lesson (Teacher)
    @PostMapping("/add")
    public Lesson addLesson(@RequestBody Lesson lesson) {
        return lessonRepo.save(lesson);
    }

    @GetMapping("/test")
public String test() {
    return "Lesson controller working";
}
    // ✅ Get All Lessons (Student / Teacher)
    @GetMapping("/all")
    public List<Lesson> getLessons() {
        return lessonRepo.findAll();
    }

    // ✅ Get Lesson by ID
    @GetMapping("/{id}")
    public Lesson getLessonById(@PathVariable String id) {
        return lessonRepo.findById(id).orElse(null);
    }

    // ✅ Delete Lesson
    @DeleteMapping("/delete/{id}")
    public void deleteLesson(@PathVariable String id) {
        lessonRepo.deleteById(id);
    }
}
