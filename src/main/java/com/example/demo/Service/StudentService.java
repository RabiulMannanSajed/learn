package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
    public void saveorUpdates(Student students) {
     
        studentRepo.save(students);
    }

    //* this is for all the user 
    public Iterable<Student> listAll() {
   return this.studentRepo.findAll();
    }

    public void deleteStudent(String id) {

        studentRepo.deleteById(id);
    }

      public Optional<Student> loginByMobile(String mobile) {
        return studentRepo.findByMobile(mobile);
    }
//     public String getStudentById(String studentid) {
//         // TODO Auto-generated method stub
//        return studentRepo.findById(studentid).get()   
//   }
}
