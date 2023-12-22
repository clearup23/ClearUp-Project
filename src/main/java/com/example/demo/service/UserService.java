package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;

public interface UserService {

    List<User> getAllUsers();

    Optional<User> getUserById(Integer id);



    User updateUser(Integer id, User user);

    void deleteUser(Integer id);

	boolean authenticateUser(String email, String password);

	boolean authenticateRole(String email, String password);
	 void registerUser(User user);	
}
