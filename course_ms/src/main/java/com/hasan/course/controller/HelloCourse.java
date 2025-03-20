package com.hasan.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/course")
public class HelloCourse {
    private static final Logger logger = LoggerFactory.getLogger(HelloCourse.class);
    
    @GetMapping("/welcome")
    public String welcomeCourse() {
        logger.info("Hello, welcome to course microservice");
        return "Hello, welcome to course microservice";
    }

    @GetMapping("/{courseName}")
    public String nameCourse(@PathVariable String courseName) {
        logger.info("Course name read from the path variable. Course name:"+courseName);
        return "Course name read from the path variable. Course name:"+courseName;
    }
    
}
