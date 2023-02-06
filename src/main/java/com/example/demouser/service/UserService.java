package com.example.demouser.service;

import com.example.demouser.dto.UserCreateEditDto;
import com.example.demouser.dto.UserReadDto;
import com.example.demouser.entity.User;
import com.example.demouser.mapper.UserCreatEditMapper;
import com.example.demouser.mapper.UserReadMapper;
import com.example.demouser.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserReadMapper userReadMapper;
    private final UserCreatEditMapper userCreatEditMapper;

    public List<UserReadDto> findAll(){
       return userRepository.findAll().stream()
                .map(userReadMapper::map)
                .toList();
    }

    public Optional<UserReadDto> findById(Long id){
        return userRepository.findById(id)
                .map(userReadMapper::map);
    }

    public UserReadDto create(UserCreateEditDto userCreateEditDto){
        return Optional.of(userCreateEditDto)
                .map(userCreatEditMapper::map)
                .map(userRepository::save)
                .map(userReadMapper::map)
                .orElseThrow();
    }

    public boolean delete(Long id){
        return userRepository.findById(id)
                .map(entity ->{
                    userRepository.delete(entity);
                    return true;
                })
                .orElse(false);
    }
}
