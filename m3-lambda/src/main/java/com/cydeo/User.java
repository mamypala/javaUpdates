package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastname;
    private int age;
}
