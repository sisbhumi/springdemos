package com.example.S11SpringBootDataJPA;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringBootDataJPA.entity.Product;
import com.example.S11SpringBootDataJPA.entity.ProductRepository;


@SpringBootTest
class S11SpringBootDataJpaApplicationTests {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
	}
	
//	@Test 
	void createProduc(){
		Product product = new Product();
		product.setName("Laptop");
		product.setDesc("Lenovo");
		product.setPrice(50000);
		
		ProductRepository productrepository = context.getBean(ProductRepository.class);
		productrepository.save(product);
	}
	
//	@Test
	void readProduct(){
		ProductRepository productrepo = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = productrepo.findById(3);
		
		if( optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product);
		}
		else {
			System.out.println("Product not present");
		}
	}
	
	@Test
	void updateProduct(){
		ProductRepository productrepo = context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct = productrepo.findById(2);
		
		if( optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			System.out.println(product.getName());
			product.setPrice(6000);
			productrepo.save(product);
		}
		else {
			System.out.println("Product not present.");
		
		}
	}
	
}
