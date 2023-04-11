package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
