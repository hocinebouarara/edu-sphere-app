package com.hocinebouarara.coursescraze.service;

import com.hocinebouarara.coursescraze.entity.Review;
import com.hocinebouarara.coursescraze.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Review review) {
        return reviewRepository.save(review);
    }

    public void deleteReviewById(Long id) {
        reviewRepository.deleteById(id);
    }

    public Optional<Review> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public List<Review> getReviewsByCourseId(Long courseId) {
        return reviewRepository.findByCourseId(courseId);
    }

}

