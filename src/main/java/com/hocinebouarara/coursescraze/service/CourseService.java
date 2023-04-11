package com.hocinebouarara.coursescraze.service;

import com.hocinebouarara.coursescraze.entity.Category;
import com.hocinebouarara.coursescraze.entity.Course;
import com.hocinebouarara.coursescraze.entity.Provider;
import com.hocinebouarara.coursescraze.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }

    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public List<Course> getCoursesByProvider(Provider provider) {
        return courseRepository.findByProvider(provider);
    }

    public List<Course> getCoursesByCategory(Category category) {
        return courseRepository.findByCategory(category);
    }
}
