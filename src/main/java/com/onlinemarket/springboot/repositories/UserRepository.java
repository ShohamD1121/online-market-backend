package com.onlinemarket.springboot.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemarket.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);

}
