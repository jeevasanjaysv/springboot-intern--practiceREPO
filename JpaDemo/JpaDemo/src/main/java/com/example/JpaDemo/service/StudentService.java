package com.example.JpaDemo.service;

import com.example.JpaDemo.model.Student;
import com.example.JpaDemo.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    Repo repo;
    public List<Student> getStudents() {
       return  repo.findAll();
    }

    public String addStudent(Student student) {
        repo.save(student);
        return "added";
    }
}
