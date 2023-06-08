package com.example.S13SpringBootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.S13SpringBootREST.entity.Product;
import com.example.S13SpringBootREST.repository.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductWebController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping
	public String getProduct(ModelMap model) {
//		model.addAttribute("products", repo.findAll());
		return "addproducts";
	}
	
	@PostMapping
	public String addProduct(@ModelAttribute("product") Product product, ModelMap model) {
		repo.save(product);
		model.addAttribute("message", "Product added successfully");
//		model.addAttribute("products", repo.findAll());
		return "addproducts";
	}
	
	@PutMapping
	 public Product update(@RequestBody Product product) {
		 return repo.save(product);
	 }
}
