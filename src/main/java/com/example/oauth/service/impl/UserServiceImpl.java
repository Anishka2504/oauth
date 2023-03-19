package com.example.oauth.service.impl;

import com.example.oauth.converter.Converter;
import com.example.oauth.dto.UserDto;
import com.example.oauth.entity.User;
import com.example.oauth.repository.UserRepository;
import com.example.oauth.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final Converter converter;

    @Override
    public UserDto findById(Long id) {
        return converter.toDto(userRepository.findById(id).orElse(null));
    }

    @Override
    public List<UserDto> findAll() {
        List<UserDto> result = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            result.add(converter.toDto(user));
        }
        return result;
    }

}
