package com.example.practice.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.model.User;
import com.example.practice.repository.UserRepository;

@RestController
//@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepository repo;

	@PostMapping("/addUser")
	public String saveUser(@RequestBody User user) {
		repo.save(user);

		return "Added Successfully";
	}

	@GetMapping("/findAllUsers")
	public List<User> getUsers() {

		return repo.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable Long id) {
		repo.deleteById(id);

		return "Deleted Successfully";
	}

}
