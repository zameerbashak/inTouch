package com.InTouch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InTouch.entities.User;
public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);

	User findByUsername(String username);

}
