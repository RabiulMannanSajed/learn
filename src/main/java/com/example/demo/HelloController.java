package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    
    @GetMapping("/hello1")
    public String sayHello() {
        return "find the port working";
    }
    
}
