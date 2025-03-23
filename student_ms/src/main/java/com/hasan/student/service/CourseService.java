package com.hasan.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasan.student.client.CourseClient;
import com.hasan.student.dto.StudentCourseDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@AllArgsConstructor
@Data
public class CourseService {
    
    private final CourseClient courseClient;
    
    public StudentCourseDto getCourseList(String studentId) {
        return courseClient.getCourseListByStudentId(studentId);
    }
}
