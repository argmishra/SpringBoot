package com.demo.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.model.User;
import com.demo.springboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/user")
	@Cacheable(value="userInfo")  
	public List<User> getAllUsers() {
		System.out.println("user information cached");  

		return userService.findAllUsers();
		
	}

}
