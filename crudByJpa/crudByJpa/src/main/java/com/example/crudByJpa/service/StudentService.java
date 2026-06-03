package com.example.crudByJpa.service;

import com.example.crudByJpa.dto.StudentDto;
import com.example.crudByJpa.dto.StudentResponseDto;
import com.example.crudByJpa.model.Student;
import com.example.crudByJpa.repository.StudentRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Student> getSudents() {
        return repo.findAll();
    }

//
//    public String addStudent(Student student) {
//        repo.save(student);
//        return "added";
//    }

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


    public Student ConvDtoToStu(StudentDto std){
        Student student = new Student();
        student.setName(std.getName());
        student.setRoll(std.getRoll());
        student.setDomain(std.getDomain());
        student.setEmail(std.getEmail());
        student.setU_id(std.getU_id());

        return student;
    }

    public StudentDto addStu(@Valid StudentDto std) {
       repo.save( ConvDtoToStu(std));


        return std;
    }

    public  StudentResponseDto ConvStuToDto(Student st){
        StudentResponseDto dto=new StudentResponseDto();
        dto.setDomain(st.getDomain());
        dto.setRoll(st.getRoll());
        dto.setName(st.getName());
        dto.setEmail(st.getEmail());
        return dto;
    }


    public StudentResponseDto getStudentsResByRoll(int r) {
        Student s=repo.findById(r).orElseThrow();
        return ConvStuToDto(s);




    }

    public Page<Student> getAllStuAsPage(int page, int size) {
       return repo.findAll(PageRequest.of(page, size));
    }
}
