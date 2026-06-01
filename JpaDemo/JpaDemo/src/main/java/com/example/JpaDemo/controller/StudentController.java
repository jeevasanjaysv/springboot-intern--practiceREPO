package com.example.JpaDemo.controller;

import com.example.JpaDemo.model.Student;
import com.example.JpaDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;
    @GetMapping("students")
    public List<Student> getStu(){
        return service.getStudents();
    }


    @PostMapping("addstudents")
    public String addStu(@RequestBody Student student){
        return service.addStudent(student);
    }

}
