package com.onlinemarket.springboot.controllers;

import com.onlinemarket.springboot.entities.User;
import com.onlinemarket.springboot.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody User userDto){
        User createdUser = userService.createUser(userDto);
        return ResponseEntity.ok(createdUser);
    }
    
}
