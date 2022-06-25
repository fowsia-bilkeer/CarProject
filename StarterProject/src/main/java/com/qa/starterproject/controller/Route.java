package com.qa.starterproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Route {
	
	@GetMapping("/home")
	public String homePage() {
		return "home.html";
	}

}
