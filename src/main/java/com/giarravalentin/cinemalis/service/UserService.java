package com.giarravalentin.cinemalis.service;

import com.giarravalentin.cinemalis.persistence.entities.User;
import com.giarravalentin.cinemalis.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {return userRepository.findAll();}
    public void createUser(User user) {userRepository.save(user);}
}
