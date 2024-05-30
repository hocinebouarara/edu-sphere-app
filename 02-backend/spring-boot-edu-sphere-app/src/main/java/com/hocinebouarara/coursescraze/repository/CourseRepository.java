package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;


@Repository
@CrossOrigin("http://localhost:4200")
public interface CourseRepository extends JpaRepository<Course ,Long> {

    Page<Course> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

    Page<Course> findByTitleContaining(@RequestParam("name") String name ,Pageable pageable);

}
