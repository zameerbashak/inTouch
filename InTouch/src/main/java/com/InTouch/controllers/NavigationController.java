package com.InTouch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.InTouch.entities.User;
import com.InTouch.services.UserService;

@Controller
public class NavigationController {
	@Autowired
	UserService service;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/openSignUp")
	public String openSignUp() {
		return "signUp";
	}
	
}
