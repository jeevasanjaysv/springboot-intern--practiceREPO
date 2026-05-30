package com.example.firstAPI.controller;

import com.example.firstAPI.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloService service;

    @GetMapping("/")
    public String greet(){
        return service.greet();
    }

    @GetMapping("/about")
    public  String aboutus(){
       return  service.about();
    }

    @GetMapping("/about/contact")
    public  String contact(){
       return  service.contact();
    }

}
