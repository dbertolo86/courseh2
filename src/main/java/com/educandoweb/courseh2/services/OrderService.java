package com.educandoweb.courseh2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseh2.entities.Order;
import com.educandoweb.courseh2.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findall(){
		return orderRepository.findAll();
	}
	
	public Order findById (Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}
