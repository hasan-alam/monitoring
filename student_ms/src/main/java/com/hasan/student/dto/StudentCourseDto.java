package com.hasan.student.dto;

import java.util.ArrayList;

public class StudentCourseDto {
    private String studentName;
    private ArrayList<String> courseList;
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setCourseList(ArrayList<String> courseList) {
        this.courseList = courseList;
    }
    public String getStudentName() {
        return studentName;
    }
    public ArrayList<String> getCourseList() {
        return courseList;
    }
    
}
