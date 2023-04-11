package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.Category;
import com.hocinebouarara.coursescraze.entity.Course;
import com.hocinebouarara.coursescraze.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course ,Long> {

    List<Course> findByProvider(Provider provider);

    List<Course> findByCategory(Category category);

}
