package com.example.S13SpringBootREST.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.S13SpringBootREST.entity.Admin;

public interface AdminRepository extends  CrudRepository<Admin, Integer> {
	List<Admin> findAdminByEmailAndPassword(String email, String password);

}
