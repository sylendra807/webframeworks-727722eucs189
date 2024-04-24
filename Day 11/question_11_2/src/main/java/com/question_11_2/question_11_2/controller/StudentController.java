package com.question_11_2.question_11_2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.question_11_2.question_11_2.model.Student;
import com.question_11_2.question_11_2.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {
    public StudentService studentService;
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public Student postMethodName(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<Student> getMethodName() {
        return studentService.getStudents();
    }
    
}
