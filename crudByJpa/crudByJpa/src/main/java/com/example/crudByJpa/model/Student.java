package com.example.crudByJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    private  int roll;
    private int U_id;
    @NotBlank(message = "Should not be blank")
    private  String name;
    private  String domain;
    private String email;
    private  String password;


}
