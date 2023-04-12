package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "courseCategory",path = "course-category")
public interface CourseCategoryRepository extends JpaRepository<CourseCategory,Long> {
}
