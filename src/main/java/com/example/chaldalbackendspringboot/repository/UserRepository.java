package com.example.chaldalbackendspringboot.repository;

import com.example.chaldalbackendspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
