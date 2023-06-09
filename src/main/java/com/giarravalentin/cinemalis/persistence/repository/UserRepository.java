package com.giarravalentin.cinemalis.persistence.repository;

import com.giarravalentin.cinemalis.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String email);
    Optional<User> findFirstByUserName(String userName);
}
