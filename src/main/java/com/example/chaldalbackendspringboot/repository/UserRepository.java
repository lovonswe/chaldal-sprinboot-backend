package com.example.chaldalbackendspringboot.repository;

import com.example.chaldalbackendspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByName(String name);
    public User findByEmail(String email);
}
