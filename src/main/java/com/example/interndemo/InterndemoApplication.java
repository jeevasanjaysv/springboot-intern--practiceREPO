package com.example.interndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InterndemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(InterndemoApplication.class, args);

        Student student1=context.getBean(Student.class);
        student1.writes();

//        student1.age=18;
//        Student student2=context.getBean(Student.class);
//        student2.age=21;
//        System.out.println(student2.age +" "+student1.age);


	}

}
