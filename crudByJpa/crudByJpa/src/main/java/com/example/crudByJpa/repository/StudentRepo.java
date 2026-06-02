package com.example.crudByJpa.repository;

import com.example.crudByJpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    List<Student> findByNameAndDomain(String name,String domain);

    List<Student> findByDomain(String domain);

    @Query(nativeQuery = true,value=  "SELECT * FROM student WHERE Name=:name And Domain=:domain")
    List<Student> findByNamAndDom(@Param("name") String Name,@Param("domain") String Domain);


    @Query("SELECT s FROM Student s WHERE 'jeeva'=s.name")
    List<Student> findByName();

    @Query("SELECT s FROM Student s WHERE s.name=:nam")
    List<Student> findStuByName(String nam);
}
