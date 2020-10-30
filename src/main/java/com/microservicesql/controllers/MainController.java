package com.microservicesql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservicesql.models.User;
import com.microservicesql.services.UserService;

@Controller
public class MainController {
	
	@Autowired
	UserService userService;
	
	@GetMapping({"/","/index"})
	public String index(Model model) {
		List<User> usuarios=userService.findAll();
		model.addAttribute("users",usuarios);
		return "index";		
	}
	

}
