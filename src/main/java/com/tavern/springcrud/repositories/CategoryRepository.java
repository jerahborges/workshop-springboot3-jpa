package com.tavern.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tavern.springcrud.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
