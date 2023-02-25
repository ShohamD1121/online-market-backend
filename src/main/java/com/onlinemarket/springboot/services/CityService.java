package com.onlinemarket.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinemarket.springboot.entities.City;
import com.onlinemarket.springboot.repositories.CityRepository;


@Service
public class CityService {
    
    @Autowired CityRepository cityRepository;

    public CityService(){

    }

    public List<City> getCities(){
        return cityRepository.findAll();
    }

    public City addCity(City city){
        return cityRepository.save(city);
    }
   

}
