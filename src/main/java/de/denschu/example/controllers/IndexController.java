package de.denschu.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(@RequestParam(value = "name", required = false, defaultValue = "Spring Boot with Thymeleaf!") String name, Model model) {
		model.addAttribute("name", name);
		// return the string name of the template file
		return "index";
	}
}
