package com.tavern.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tavern.springcrud.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
