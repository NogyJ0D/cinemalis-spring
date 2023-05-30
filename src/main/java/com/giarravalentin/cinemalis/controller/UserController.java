package com.giarravalentin.cinemalis.controller;

import com.giarravalentin.cinemalis.persistence.entities.Movie;
import com.giarravalentin.cinemalis.persistence.entities.User;
import com.giarravalentin.cinemalis.service.MovieService;
import com.giarravalentin.cinemalis.service.ReviewService;
import com.giarravalentin.cinemalis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {return ResponseEntity.ok(userService.getAllUsers());}

    @PostMapping("/")
    public void createUser(@RequestBody User user) {userService.createUser(user);}
}
