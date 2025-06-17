package com.nondas.todojava.controllers;

import com.nondas.todojava.repositories.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//use @RestController if you want to return JSON responses
@RequiredArgsConstructor
public class TodoController {
	private final TodoRepository todoRepository;


	@GetMapping({"/", "/home"})
	public String showHomePage(Model model) {
		model.addAttribute("todos",
						   todoRepository.findAll());
		return "index"; // This will return the index.html page from the templates directory
	}
}
