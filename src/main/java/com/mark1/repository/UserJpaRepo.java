package com.mark1.repository;

import java.util.Optional;

import com.mark1.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
