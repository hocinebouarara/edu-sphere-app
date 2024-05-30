package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "courseCategory",path = "course-category")
public interface CourseCategoryRepository extends JpaRepository<CourseCategory,Long> {
}
