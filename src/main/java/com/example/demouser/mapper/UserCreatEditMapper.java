package com.example.demouser.mapper;

import com.example.demouser.dto.UserCreateEditDto;
import com.example.demouser.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserCreatEditMapper implements Mapper<UserCreateEditDto, User> {

    @Override
    public User map(UserCreateEditDto object) {
        User user = new User();
        user.setFirstname(object.getFirstname());
        user.setLastname(object.getLastname());
        user.setBirthday(object.getBirthDate());
        user.setEmail(object.getEmail());
        user.setRole(object.getRole());
        return user;
    }
}
