package com.educandoweb.courseh2.resources;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.courseh2.entities.Product;
import com.educandoweb.courseh2.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class CategoryResource {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		
		List<Product> list  = productService.findall();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product p = productService.findById(id);
		
		return ResponseEntity.ok().body(p);
	}
}
