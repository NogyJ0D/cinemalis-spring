package com.giarravalentin.cinemalis.service;

import com.giarravalentin.cinemalis.persistence.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    private UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthService(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public Optional<User> signUp(User user) {
        Optional<User> emailExists = userService.getByEmail(user.getEmail());
        Optional<User> userNameExists = userService.getByUserName(user.getUserName());

    }
}
