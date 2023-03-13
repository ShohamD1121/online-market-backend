package com.onlinemarket.springboot.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onlinemarket.springboot.entities.User;
import com.onlinemarket.springboot.repositories.UserRepository;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User updateUser(User user) {
        // Find the user by ID
        User existingUser = userRepository.findById(user.getId()).orElse(null);

        if (existingUser == null) {
            // Handle the case where the user doesn't exist
            throw new RuntimeException("User not found");
        }

        // Update the user fields
        existingUser.setEmail(user.getEmail());
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setAddress(user.getAddress());
        existingUser.setPhone(user.getPhone());

        // Save the updated user to the database
        return userRepository.save(existingUser);
    }
}


