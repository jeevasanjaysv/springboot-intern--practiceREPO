package com.example.firstAPI.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {


    public String greet() {
        return "HELLO!!!!";
    }

    public String about() {
        return "Its Jeeva";
    }

    public String contact() {
        return "Ph no :988278392";
    }
}
