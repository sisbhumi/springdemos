package com.example.S13SpringBootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.S13SpringBootREST.entity.Admin;
import com.example.S13SpringBootREST.entity.Buyer;
import com.example.S13SpringBootREST.repository.BuyerRepository;

@Controller
@RequestMapping("/buyer")
public class BuyerController {

	@Autowired
	private BuyerRepository repository;

	
	//To fetch all buyers
	@GetMapping
	public String getBuyer(Model model) {
		model.addAttribute("buyer", repository.findAll());
		return "buyers";
	}
	
	@PostMapping
	public String addBuyer(@ModelAttribute("buyer") Buyer buyer, ModelMap model) {
		repository.save(buyer);
		model.addAttribute("buyer", repository.findAll());
		return "buyers";
	}
	

}
