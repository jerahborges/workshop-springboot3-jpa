package com.tavern.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tavern.springcrud.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
