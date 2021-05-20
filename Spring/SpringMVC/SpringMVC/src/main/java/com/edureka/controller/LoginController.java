package com.edureka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String firstScreen() {
		return "home";		
	}

	@RequestMapping("/welcome")
	public String welcomeScreen() {
		return "welcome";		
	}
	
}
