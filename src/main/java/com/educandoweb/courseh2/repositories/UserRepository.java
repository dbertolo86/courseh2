package com.educandoweb.courseh2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseh2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
