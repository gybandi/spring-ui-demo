package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping(value = "/newUser")
	public String registrationForm(Model model) {
		List<User> allUsers = userRepository.findAll();
		model.addAttribute("allUsers", allUsers);
		model.addAttribute("user", new User());
		model.addAttribute("UserTypes", UserType.values());
		return "register";
	}

	@PostMapping(value = "/registerUser")
	public String registerUser(@ModelAttribute(value = "user") User user) {
		userRepository.save(user);
		return "redirect:newUser";
	}
}
