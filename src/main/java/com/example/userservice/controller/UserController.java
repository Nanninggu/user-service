package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") //url:포트번호/맵핑정보
public class UserController {

    @GetMapping("/health_check")
    public String status() {
        return "It's Working in User Service";
    }
}
