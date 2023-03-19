package com.example.oauth.converter;

import com.example.oauth.dto.UserDto;
import com.example.oauth.entity.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Mapper(componentModel = "spring")
@Component
public interface Converter {

    UserDto toDto(User user);

    User toUser(UserDto dto);
}
