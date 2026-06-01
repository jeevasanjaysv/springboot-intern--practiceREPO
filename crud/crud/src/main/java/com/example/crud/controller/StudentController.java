package com.example.crud.controller;

import com.example.crud.model.Student;
import com.example.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public StudentService service;



    @GetMapping("students")
    public List<Student> getStudents(){
        return service.getStudents();
    }
    @GetMapping("students/{id}")
    public Student getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @PostMapping("addstudents")
    public  String addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

    @PutMapping("update/{id}")
    public String updateStudentById(@RequestBody Student student,@PathVariable int id){
        return service.updateStudentById(student,id);
    }

    @PutMapping("update")
    public String updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }



    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return service.deleteStudent(id);
    }

}
