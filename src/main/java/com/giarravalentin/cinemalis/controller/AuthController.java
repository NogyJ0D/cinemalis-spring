package com.giarravalentin.cinemalis.controller;

import com.giarravalentin.cinemalis.persistence.entities.User;
import com.giarravalentin.cinemalis.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @PostMapping("/signup")
    public Optional<User> signUp(@RequestBody User user){
        Optional<User> response = authService.signUp(user);
    }
}
