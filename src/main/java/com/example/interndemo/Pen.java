package com.example.interndemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer {

    public  void write()
    {
        System.out.println("write by pen");
    }
}
