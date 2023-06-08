package com.example.S13SpringBootREST.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.S13SpringBootREST.entity.Admin;

public interface AdminRepository extends  CrudRepository<Admin, Integer> {

}
