package com.onlinemarket.springboot.entities;

import java.security.Timestamp;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID userId;

    private Timestamp orderDate;

    private String status;

    private float totalAmount;

    private String shippingAddress;

    private String paymentMethod;

    private String paymentId;

    private Timestamp shippingDate;

    private String shippingCarrier;

    private String shippingTrackingNumber;    

}


