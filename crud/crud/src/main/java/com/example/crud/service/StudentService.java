package com.example.crud.service;

import com.example.crud.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    static List<Student> studentList = new ArrayList<>();
    static {
         studentList.add( new Student(1,"jeeva","springboot"));
         studentList.add(new Student(2,"sanjay","mern"));
    }
    public List<Student> getStudents() {
        return studentList;

    }

    public Student getStudentById(int id) {
//      return  studentList.stream().filter(s->s.getRollno()==id).findFirst().orElseThrow();
      int i=0;
        for (int j = 0; j < studentList.size(); j++) {
            if (studentList.get(j).getRollno()==id){
                return studentList.get(j);
            }
        }
        return new Student(0,"","");

    }

    public String addStudent(Student student) {
        studentList.add(student);
        return  "Added";
    }

    public String updateStudentById(Student student,int id) {
        for (int j = 0; j < studentList.size(); j++) {
            if (studentList.get(j).getRollno()==id){
               studentList.set(j,student);
               return  "Updated";
            }
        }
        return "Notfound";
    }
    public String updateStudent(Student student) {
        for (int j = 0; j < studentList.size(); j++) {
            if (studentList.get(j).getRollno()==student.getRollno()){
                studentList.set(j,student);
                return  "Updated";
            }
        }
        return "Notfound";
    }

    public String deleteStudent(int id) {
        for (int j = 0; j < studentList.size(); j++) {
            if (studentList.get(j).getRollno()==id){
                studentList.remove(j);
                return  "deleted";
            }
        }
        return "NotFound";
    }


}
