package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment,Long> {

    List<Enrollment> getEnrollmentsByUserId(Long userId);
}
