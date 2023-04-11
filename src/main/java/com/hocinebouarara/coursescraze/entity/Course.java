package com.hocinebouarara.coursescraze.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "course")
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "level")
    private String level;

    @Column(name = "category")
    private String category;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

    public Course() {
    }

    public Course(Long id, String title, String description, Double price, Double rating, String level, String category, String thumbnailUrl, List<Review> reviews) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.level = level;
        this.category = category;
        this.thumbnailUrl = thumbnailUrl;
        this.reviews = reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id) && Objects.equals(title, course.title) && Objects.equals(description, course.description) && Objects.equals(price, course.price) && Objects.equals(rating, course.rating) && Objects.equals(level, course.level) && Objects.equals(category, course.category) && Objects.equals(thumbnailUrl, course.thumbnailUrl) && Objects.equals(reviews, course.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, price, rating, level, category, thumbnailUrl, reviews);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", level='" + level + '\'' +
                ", category='" + category + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}

