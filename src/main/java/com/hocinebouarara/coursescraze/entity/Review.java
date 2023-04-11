package com.hocinebouarara.coursescraze.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;
import java.util.Objects;

@Entity
@Table(name = "review")
@Getter
@Setter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "rating")
    private Integer rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;


    public Review() {
    }

    public Review(Long id, String comment, Integer rating, Course course) {
        this.id = id;
        this.comment = comment;
        this.rating = rating;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id) && Objects.equals(comment, review.comment) && Objects.equals(rating, review.rating) && Objects.equals(course, review.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, comment, rating, course);
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                ", course=" + course +
                '}';
    }
}

