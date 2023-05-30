package com.giarravalentin.cinemalis.persistence.repository;

import com.giarravalentin.cinemalis.persistence.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
