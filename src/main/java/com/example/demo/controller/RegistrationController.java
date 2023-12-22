package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
 
@RestController
@RequestMapping ("/registration")
public class RegistrationController

{
 
    @Autowired
    private UserRepository userRepository; // Assuming you have a UserRepository for database operations
 
    @PostMapping("/registration")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        // Check if the email already exists
        if (userRepository.existsByEmail(user.getEmail())) {
            return ResponseEntity.badRequest().body("Email already exists");
        }
 
        // Save the user to the database
        userRepository.save(user);
 
        return ResponseEntity.ok("User registered successfully");
    }
}