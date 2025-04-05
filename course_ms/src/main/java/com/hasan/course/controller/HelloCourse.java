package com.hasan.course.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.course.dto.StudentCourseDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/course")
public class HelloCourse {
    private static final Logger logger = LoggerFactory.getLogger(HelloCourse.class);
    private static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("InfoLogging");
    @GetMapping("/welcome")
    public String welcomeCourse() {
        LOGGER.info("JUL:Hello, welcome to course microservice");
        System.out.println("SYSOUT:Hello, welcome to course microservice");
        logger.info("Hello, welcome to course microservice");
        return "Hello, welcome to course microservice";
    }

    @GetMapping("/{courseName}")
    public String nameCourse(@PathVariable String courseName) {
        logger.info("Course name read from the path variable. Course name:"+courseName);
        return "Course name read from the path variable. Course name:"+courseName;
    }

    @GetMapping("/sleep")
    public String sleep(@RequestParam int sleepTime) {
        logger.info("Now:"+new Date());
        logger.info("Going to sleep for:"+sleepTime);
        try {
            Thread.sleep(sleepTime);
        } catch(Exception ex) {

        }
        logger.info("Slept for "+sleepTime);
        logger.info("Now:"+new Date());
        return new String("Slept for "+sleepTime);
    }
    @GetMapping(value = "/student/{studentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentCourseDto getCourseListByStudentId(@PathVariable String studentId) {
        StudentCourseDto dto = new StudentCourseDto();
        dto.setStudentName(studentId);
        logger.info("Retriving course List for student ID:"+studentId);
        String[] array = {"CSE1001", "EEE1005", "MATH1008"};
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, array);
        dto.setCourseList(list);
        return dto;
    }
    
}
