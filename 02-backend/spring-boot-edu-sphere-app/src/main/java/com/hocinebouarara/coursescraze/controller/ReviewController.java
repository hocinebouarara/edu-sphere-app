package com.hocinebouarara.coursescraze.controller;

import com.hocinebouarara.coursescraze.entity.Review;
import com.hocinebouarara.coursescraze.service.ReviewService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/{id}")
    public Optional<Review> getReviewById(@PathVariable(value = "id") Long id) {
        return reviewService.getReviewById(id);
    }

    @PostMapping("/")
    public ResponseEntity<Review> createReview(@Valid @RequestBody Review review) {
        Review createdReview = reviewService.createReview(review);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdReview);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Review> updateReview(@PathVariable(value = "id") Long id, @Valid @RequestBody Review review) {
        Review updatedReview = reviewService.updateReview(review);
        return ResponseEntity.ok().body(updatedReview);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteReview(@PathVariable(value = "id") Long id) {
        reviewService.deleteReviewById(id);
        return ResponseEntity.noContent().build();
    }
}

