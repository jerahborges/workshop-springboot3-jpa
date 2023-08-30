package com.tavern.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tavern.springcrud.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
