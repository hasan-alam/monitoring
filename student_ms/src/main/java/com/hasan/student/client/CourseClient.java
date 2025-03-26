package com.hasan.student.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hasan.student.dto.StudentCourseDto;

@FeignClient(name = "course-service"/*, url = "${course.service.url}"*/)
public interface CourseClient {

    @GetMapping("/course/student/{studentId}")
    StudentCourseDto getCourseListByStudentId(@PathVariable("studentId") String studentId);
}
