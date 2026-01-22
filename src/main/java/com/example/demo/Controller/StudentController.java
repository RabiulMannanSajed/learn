package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")

public class StudentController {
    
 @Autowired
    private StudentService studentServices;


        @PostMapping("/login")
         public Student login(@RequestBody Student student) {

             return studentServices.loginByMobile(student.getMobile())
            .orElseThrow(() -> new RuntimeException("User not found"));
}

         @PostMapping(value ="/save")
      
         private String saveStudent(@RequestBody Student students) {
          
         studentServices.saveorUpdates(students);
          return students.getId();
         }

          //* This is the get method
        @GetMapping(value ="/getAll")
     
        private Iterable<Student> getAllStudents()     {
         
         return  studentServices.listAll();
        }
   
        //* this is the updated method
        @PutMapping(value ="/edit/{id}")

        private  Student Update(@RequestBody Student student,@PathVariable(name="id") String id)
        {
    
        student.setId(id);
        studentServices.saveorUpdates(student);
        return student;
        }

       //this is for delete method
        @DeleteMapping("/delete/{id}")  
        private void deleteStudent(@PathVariable("id") String id)   
        {
    
        studentServices.deleteStudent(id);
        }

        // TODO This is not working 
    //    @RequestMapping(value="/student/{id}")
    //     private String getStudent(@PathVariable(name = "id") String studentid) {
    //         return studentServices.getStudentById(studentid);
    //     }
        

}
