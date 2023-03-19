package com.example.oauth.dto;

import java.util.List;

public class UserDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String login;

    private String password;

    List<RoleDto> roles;
}
