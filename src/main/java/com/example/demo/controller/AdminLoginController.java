package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminLoginController {

    @Autowired
    private UserService userService;
    
    
    @PostMapping("/login")
    public ResponseEntity<String> adminLogin(@RequestBody User user) {
        String email = user.getEmail();
        String password = user.getPassword();

        if (userService.authenticateUser(email, password)) {
            return new ResponseEntity<>("Admin login successful", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Invalid login", HttpStatus.UNAUTHORIZED);
        }
    }
}
