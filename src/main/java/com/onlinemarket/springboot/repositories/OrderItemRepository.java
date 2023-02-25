package com.onlinemarket.springboot.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemarket.springboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {
    
}
