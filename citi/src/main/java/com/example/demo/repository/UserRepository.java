package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.bean.User;

public interface UserRepository extends JpaRepository<User,Long>{
	//User findById(long id);
	@Query(value = "Select u from User u where email=:email")
	User findByEmail(String email);

	//Mockito ---https://github.com/sanjaydegaonkar/IRP/tree/master/TDD_Mockito/BankApplication
	//https://github.com/sanjaydegaonkar/SpringBoot/tree/master/Project_Demos/Employee_CRUD_Query/src/main/java/com/crescent
	//User-Role mapping ---  https://dzone.com/articles/introduction-to-spring-data-jpa-part-4-bidirection
}
