package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course ,Long> {

}
