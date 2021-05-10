package com.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Value("${user.first.name}")
	private String firstName;
	
	@Value("${user.last.name:Mishra}")
	private String lastName;
	
	@RequestMapping("/hello")
	public String hello(@RequestParam String prefix ) {
		return "Hello " + prefix + " " + firstName + " " + lastName;
	}
}
