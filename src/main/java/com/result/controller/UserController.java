package com.result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.result.entity.User;
import com.result.service.UserService;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public void saveUser(@RequestBody User user) {
		userService.saveUser(user);
	}

	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User user) {
		User loggedInUser = userService.validateUser(user.getEmail(), user.getPassword());
		if (loggedInUser != null) {
			return ResponseEntity.ok().body(Map.of(
					"message", "Login successful",
					"username", loggedInUser.getUsername(),
					"role", loggedInUser.getRole()
			));
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of(
					"message", "Invalid email or password"
			));
		}
	}



}
