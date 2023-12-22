package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }


    @Override
    public User updateUser(Integer id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        }
        return null; // Handle not found scenario as needed
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
    @Override
    public boolean authenticateUser(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);
        return user != null && "ADMIN".equals(user.getRole());
 
    }
    @Override
	public boolean authenticateRole(String email, String password) {
		User user = userRepository.findByEmailAndPassword(email, password);
		return user != null && ("student".equals(user.getRole()) || "teacher".equals(user.getRole()));
	}
    @Override
    public void registerUser(User user) {
        // Perform any additional validation or business logic before saving
        // For example, check if the email is unique

        // Save the user to the database
       userRepository.save(user);
	
}
}
