package com.onlinemarket.springboot.services;

import com.onlinemarket.springboot.dto.UserDto;
import com.onlinemarket.springboot.entities.User;
import com.onlinemarket.springboot.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
   private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserDto userDto){
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setAddress(userDto.getAddress());
        user.setPhone(userDto.getPhone());
        user.setRole("ROLE_USER"); // Set default role for new users
        return userRepository.save(user);
    }

}
