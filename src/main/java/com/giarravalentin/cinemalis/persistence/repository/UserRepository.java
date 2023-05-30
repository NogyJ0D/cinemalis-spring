package com.giarravalentin.cinemalis.persistence.repository;

import com.giarravalentin.cinemalis.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
