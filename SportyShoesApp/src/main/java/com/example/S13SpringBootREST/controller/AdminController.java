package com.example.S13SpringBootREST.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.S13SpringBootREST.repository.AdminRepository;
import com.example.S13SpringBootREST.entity.Admin;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminRepository repository;

	@GetMapping
	public String getAdmin(@ModelAttribute("admin") Admin admin, Model model, BindingResult result) {
		return "admins";
	}

	@PostMapping
	public String addAdmin(@ModelAttribute("admin") Admin admin, ModelMap model) {
		
		List<Admin> admin_list = repository.findAdminByEmailAndPassword(admin.getEmail(),admin.getPassword());
		if(admin_list.isEmpty()) {
			model.addAttribute("message", "Please Enter  Valid Credentials!");
			return "admins" ;
		}
		else {
			return "index" ;
		}
	}

}
