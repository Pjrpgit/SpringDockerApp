package com.microservicesql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicesql.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
