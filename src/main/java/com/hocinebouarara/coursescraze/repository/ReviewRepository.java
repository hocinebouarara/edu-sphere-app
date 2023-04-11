package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
}
