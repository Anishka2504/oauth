package com.example.oauth.service;

import com.example.oauth.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto findById(Long id);

    List<UserDto> findAll();
}
