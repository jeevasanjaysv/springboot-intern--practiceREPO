package com.example.crudByJpa.dto;

import lombok.Data;

@Data
public class StudentResponseDto {

    private  int roll;
    private  String name;
    private  String domain;
    private String email;

}
