package com.example.demouser.dto;

import com.example.demouser.entity.Role;
import lombok.Value;

import java.time.LocalDate;

@Value
public class UserCreateEditDto {

    String firstname;
    String lastname;
    LocalDate birthDate;
    String email;
    Role role;
}
