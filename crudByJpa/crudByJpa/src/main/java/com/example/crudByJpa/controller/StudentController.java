package com.example.crudByJpa.controller;

import com.example.crudByJpa.model.Student;
import com.example.crudByJpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stu")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/")
    public List<Student> getStudents(){
        return  service.getSudents();
    }

    @GetMapping("/{rno}")
    public Student getStuById(@PathVariable int rno){
        return service.getStById(rno);
    }

    @GetMapping("custom")
    public List<Student> getByNameAndDomain(@Param("name") String name,@Param("domain") String domain){
        return service.getByNameAndDomain(name,domain);
    }

    @GetMapping("/tech/{d}")
    public  List<Student> getByDomain(@PathVariable String d)
    {
        return  service.getByDomain(d);
    }

    @GetMapping("/name")
    public  List<Student> getByName(){
        return service.getByName();
    }

    @GetMapping("name/{nam}")
    public  List<Student> getStuByName(@PathVariable String nam){
        return service.getStuByName(nam);
    }



    @PostMapping("/filter")
    public List<Student> getStuByNameAnDomain(@Param("name") String name,@Param("domain") String domain){
        return service.getStuByNameAndDomain(name,domain);
    }


    @PostMapping("addstudent")
    public  String addStudent(@RequestBody Student S){
        return service.addStudent(S);
    }

    @PutMapping("updatestudent")
    public String updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("delete/{id}")
    public String deleteStu(@PathVariable int id){
        return service.deleteStu(id);
    }



}
