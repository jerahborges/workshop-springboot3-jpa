package com.tavern.springcrud.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tavern.springcrud.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> finfAll(){
			User u = new User(1L, "Maria", "maria@gmail.com", "29292929", "123455");
			return ResponseEntity.ok().body(u);
	}
}
