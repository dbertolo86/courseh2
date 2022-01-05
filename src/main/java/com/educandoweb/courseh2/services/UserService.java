package com.educandoweb.courseh2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseh2.entities.User;
import com.educandoweb.courseh2.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> findall(){
		return userRepository.findAll();
	}
	
	public User findById (Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
}
