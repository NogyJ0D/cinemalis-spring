package com.giarravalentin.cinemalis.controller;

import com.giarravalentin.cinemalis.persistence.entities.Review;
import com.giarravalentin.cinemalis.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @GetMapping("/")
    public ResponseEntity<List<Review>> getAllReviews() {return ResponseEntity.ok(reviewService.getAllReviews());}

    @PostMapping("/")
    public void createReview(@RequestBody Review review) {reviewService.createReview(review);}
}
