package com.educandoweb.courseh2.config;

import java.time.Instant;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.courseh2.entities.Order;
import com.educandoweb.courseh2.entities.User;
import com.educandoweb.courseh2.entities.enums.OrderStatus;
import com.educandoweb.courseh2.repositories.UserRepository;
import com.educandoweb.courseh2.repositories.OrderRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User u1 = new User (null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User (null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		
		Order o1 = new Order(null, Instant.parse("2022-01-06T13:35:01Z"), OrderStatus.PAID,u1);
		Order o2 = new Order(null, Instant.parse("2022-01-05T13:35:01Z"), OrderStatus.WAITING_PAYMENT,u2);
		Order o3 = new Order(null, Instant.parse("2022-01-04T13:35:01Z"), OrderStatus.WAITING_PAYMENT,u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));

		
	}
	
}
