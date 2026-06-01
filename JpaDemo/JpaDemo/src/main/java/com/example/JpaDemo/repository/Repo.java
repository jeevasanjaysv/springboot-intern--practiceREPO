package com.example.JpaDemo.repository;

import com.example.JpaDemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Student,Integer> {
}
