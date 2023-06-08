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
@RequestMapping("")
public class ProductWebController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/products")
	public String getProducts(ModelMap model) {
		Iterable<Product> products = repo.findAll();
		model.addAttribute("products", products);
		return "addproducts";
	}
	
	@GetMapping("/all")
	public String getAllProducts(ModelMap model) {
		Iterable<Product> products = repo.findAll();
		model.addAttribute("products", products);
		return "showproducts";
	}
	
	@GetMapping("/category")
	public String getProductsByCategory(ModelMap model) {
		return "categorisedproducts";
	}
	
	@PostMapping("/category")
	public String searchProductsByCategory(@ModelAttribute("product") Product product, ModelMap model) {
		Iterable<Product> products = repo.findProductsByCategory(product.getCategory());
		model.addAttribute("products", products);
		return "showproducts";
	}
	

	
	@PostMapping("/products")
	public String addProduct(@ModelAttribute("product") Product product, ModelMap model) {
		model.addAttribute("product", repo.findAll());
		repo.save(product);
		model.addAttribute("message", "Product added successfully");
		return "index";
	}
	
	@PutMapping
	 public Product update(@RequestBody Product product) {
		 return repo.save(product);
	 }
}
