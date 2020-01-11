package com.HAndN.spring_hibernate.repository;

import com.HAndN.spring_hibernate.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getByUserName(String userName);
}
