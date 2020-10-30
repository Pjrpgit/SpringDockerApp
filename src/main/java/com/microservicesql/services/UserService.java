package com.microservicesql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicesql.repositories.UserRepository;
import com.microservicesql.models.User;



@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public List<User> findAll() {
		return userRepo.findAll();
	}
	
	public User findById(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	
	public void save(User user) {
		userRepo.save(user);
	}
	
	public void delete(User user) {
		userRepo.delete(user);
	}
	
}
