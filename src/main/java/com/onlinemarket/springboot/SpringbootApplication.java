package com.onlinemarket.springboot;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {


	public static void main(String[] args) {

		
		Map<String, String> envVars = System.getenv();
		envVars.forEach((key, value) -> System.setProperty(key, value));
		SpringApplication.run(SpringbootApplication.class, args);
	}



}
