package com.onlinemarket.springboot.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemarket.springboot.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
    
}
