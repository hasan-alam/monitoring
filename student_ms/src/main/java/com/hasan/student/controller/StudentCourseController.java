package com.hasan.student.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hasan.student.dto.StudentCourseDto;
import com.hasan.student.service.CourseService;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@Data
@AllArgsConstructor
public class StudentCourseController {
    private static final Logger logger = LoggerFactory.getLogger(StudentCourseController.class);
    private final CourseService courseService;
    @GetMapping("/students/courses/{studentId}")
    public StudentCourseDto getStudentCourseList(@PathVariable String studentId) {
        StudentCourseDto dto = courseService.getCourseList(studentId);
        logger.info("Courses returned by course_service for student:"+dto.getStudentName());
        for(String course : dto.getCourseList()) {
            logger.info("Courses :"+course);
        }
        return dto;
    }
}
