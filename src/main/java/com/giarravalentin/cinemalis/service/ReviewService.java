package com.giarravalentin.cinemalis.service;

import com.giarravalentin.cinemalis.persistence.entities.Review;
import com.giarravalentin.cinemalis.persistence.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {return reviewRepository.findAll();}
    public void createReview(Review review) {reviewRepository.save(review);}
}
