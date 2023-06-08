package com.example.S11SpringBootDataJPA.entity;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.S11SpringBootREST.controller.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	Optional<Product> findAllById();

}
