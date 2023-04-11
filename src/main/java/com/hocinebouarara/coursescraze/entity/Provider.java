package com.hocinebouarara.coursescraze.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "provider")
@Data
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();

    public Provider(){

    }

    public Provider(Long id, String name, String description, String email, String phoneNumber, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return Objects.equals(id, provider.id) && Objects.equals(name, provider.name) && Objects.equals(description, provider.description) && Objects.equals(email, provider.email) && Objects.equals(phoneNumber, provider.phoneNumber) && Objects.equals(courses, provider.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, email, phoneNumber, courses);
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", courses=" + courses +
                '}';
    }
}

