package com.demo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ActuatorController {
	
	@RequestMapping("/act")
	public String hello() {
		return "Actuator";
	}

}
