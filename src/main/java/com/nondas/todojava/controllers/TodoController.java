package com.nondas.todojava.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//use @RestController if you want to return JSON responses
public class TodoController {

	@GetMapping({"/", "/home"})
	public String showHomePage() {
		return "index"; // This will return the index.html page from the templates directory
	}
}
