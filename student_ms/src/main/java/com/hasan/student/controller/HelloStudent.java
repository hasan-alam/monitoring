package com.hasan.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/student")
public class HelloStudent {
    private static final Logger logger = LoggerFactory.getLogger(HelloStudent.class);
    
    @GetMapping("/welcome")
    public String welcomeCourse() {
        logger.info("Hello, welcome to student microservice");
        return "Hello, welcome to student microservice";
    }

    @GetMapping("/{studentName}")
    public String nameCourse(@PathVariable String studentName) {
        logger.info("Student name read from the path variable. Student name:"+studentName);
        return "Student name read from the path variable. Student name:"+studentName;
    }
    
}

