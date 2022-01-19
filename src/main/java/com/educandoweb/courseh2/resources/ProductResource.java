package com.educandoweb.courseh2.resources;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.courseh2.entities.Category;
import com.educandoweb.courseh2.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class ProductResource {

	@Autowired
	private CategoryService userService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		
		List<Category> list  = userService.findall();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category u = userService.findById(id);
		
		return ResponseEntity.ok().body(u);
	}
}
