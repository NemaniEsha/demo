package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.bean.User;

public interface UserRepository extends JpaRepository<User,Long>{
	//User findById(long id);
	@Query(value = "Select u from User u where email=:email")
	User findByEmail(String email);
}
