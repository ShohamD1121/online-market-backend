package com.onlinemarket.springboot.user;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinemarket.springboot.entities.User;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable UUID userId, @RequestBody User user) {
        // Set the ID of the user object to the path variable value
        user.setId(userId);
        // Call the updateUser method of the UserService
        return userService.updateUser(user);
    }
}
