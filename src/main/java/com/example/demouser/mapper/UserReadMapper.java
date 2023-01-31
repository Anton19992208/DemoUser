package com.example.demouser.mapper;

import com.example.demouser.dto.UserReadDto;
import com.example.demouser.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserReadMapper implements Mapper<User, UserReadDto> {

    @Override
    public UserReadDto map(User object) {
        return new UserReadDto(
                object.getId(),
                object.getFirstname(),
                object.getLastname(),
                object.getBirthday(),
                object.getEmail(),
                object.getRole()
        );
    }
}
