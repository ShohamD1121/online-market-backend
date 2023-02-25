package com.onlinemarket.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.onlinemarket.springboot.entities.City;

public interface CityRepository extends JpaRepository<City, Long>{
    
}
