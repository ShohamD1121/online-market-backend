package com.onlinemarket.springboot.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemarket.springboot.entities.Order;

public interface OrderRepositoy extends JpaRepository<Order, UUID>{
    
}
