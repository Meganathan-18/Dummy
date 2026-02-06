package com.example.demo_hack.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo_hack.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}