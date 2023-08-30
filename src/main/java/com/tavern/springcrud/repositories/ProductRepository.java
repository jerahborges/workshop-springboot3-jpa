package com.tavern.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tavern.springcrud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
