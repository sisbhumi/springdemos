package com.example.S13SpringBootREST.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.S13SpringBootREST.entity.Admin;
import com.example.S13SpringBootREST.entity.Buyer;

public interface BuyerRepository extends  CrudRepository<Buyer, Integer> {

	List<Buyer> findByName(String name);
}
