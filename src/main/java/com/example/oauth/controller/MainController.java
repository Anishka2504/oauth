package com.example.oauth.controller;

import com.example.oauth.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class MainController {

    private final UserService userService;

    @GetMapping("/")
    public String homePage(){
        return "home page";
    }

    @GetMapping("/user_page")
    public String userPage() {
        return "Hello!";
    }
}
