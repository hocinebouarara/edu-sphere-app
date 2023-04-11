package com.hocinebouarara.coursescraze.repository;

import com.hocinebouarara.coursescraze.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // add custom query methods, if

    Optional<User> findByEmail(String email);

}
