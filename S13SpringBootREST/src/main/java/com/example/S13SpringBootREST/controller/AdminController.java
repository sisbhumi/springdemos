package com.example.S13SpringBootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.S13SpringBootREST.repository.AdminRepository;
import com.example.S13SpringBootREST.entity.Admin;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminRepository repository;

	@GetMapping
	public String getAdmin(Model model) {
		model.addAttribute("admin", repository.findAll());
		return "admins";
	}

	@PostMapping
	public String addAdmin(@ModelAttribute("admin") Admin admin, ModelMap model) {
		repository.save(admin);
		model.addAttribute("admin", repository.findAll());
		return "admins";
	}
	
	
}
