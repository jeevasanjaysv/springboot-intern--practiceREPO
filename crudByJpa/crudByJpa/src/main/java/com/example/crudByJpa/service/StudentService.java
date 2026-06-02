package com.example.crudByJpa.service;

import com.example.crudByJpa.model.Student;
import com.example.crudByJpa.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Student> getSudents() {
        return repo.findAll();
    }


    public String addStudent(Student student) {
        repo.save(student);
        return "added";
    }

    public Student getStById(int rno) {
        return repo.findById(rno).orElse(new Student());
    }

    public String updateStudent(Student student) {

        repo.save(student);
        return "Updated";

    }

    public String deleteStu(int id) {
        if(repo.findById(id).isPresent()) {
            repo.deleteById(id);
            return "deleted";
        }
        return "Not found";

    }

    public List<Student> getByNameAndDomain(String name, String domain) {

        return repo.findByNameAndDomain(name,domain);
    }

    public List<Student> getByDomain(String d) {
        return repo.findByDomain(d);
    }

    public List<Student> getStuByNameAndDomain(String name, String domain) {

        return repo.findByNamAndDom(name,domain);
    }

    public List<Student> getByName() {
        return repo.findByName();
    }

    public List<Student> getStuByName(String s) {
        return repo.findStuByName(s);
    }
}
