package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")

public class StudentController {
    
 @Autowired
    private StudentService studentServices;


@PostMapping(value ="/save")

// TODO : return id after saving student this si not found
public String saveStudent(@RequestBody Student students) {
    
   studentServices.saveorUpdates(students);
    return students.id;
}


}
