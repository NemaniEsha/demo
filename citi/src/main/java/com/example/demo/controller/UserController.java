package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.service.UserServiceImpl;


@RestController
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/adduser")
	public ResponseEntity<?> addUser(@RequestBody User user)
	{
		userService.addUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	/*@GetMapping("/user/{id}")
	public  ResponseEntity<?> getUserById(@PathVariable long id)
	{
		User user = userService.getUserById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}*/
	
	
	@GetMapping("/user/{email}")
	public  ResponseEntity<?> getUserByEmail(@PathVariable String email)
	{
		
		return new ResponseEntity<User>(userService.getUserByEmail(email), HttpStatus.OK);
	}
	
	/*@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable long id)
	{
		userService.deleteUserById(id);
	}*/
}
