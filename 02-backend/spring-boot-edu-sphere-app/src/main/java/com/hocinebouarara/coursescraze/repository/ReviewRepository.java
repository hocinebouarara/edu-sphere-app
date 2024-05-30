package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {

    List<Review> getReviewByCourseId(Long courseId);
}
