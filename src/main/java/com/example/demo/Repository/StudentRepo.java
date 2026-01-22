package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Entity.Student;

public interface StudentRepo extends MongoRepository<Student, String> {
        Optional<Student> findByMobile(String mobile);

}
