package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.User;
import com.example.demo.exception.DuplicateUserException;
import com.example.demo.exception.NoSuchUserFoundException;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
    UserRepository userRepository;
	
	public User addUser(User user) {
		User registerUser = userRepository.findByEmail(user.getEmail());
		if(registerUser==null)
		{
			return userRepository.save(user);
		}
		else
			throw new DuplicateUserException("User with email : " + user.getEmail()
					+ " already exists");
		
	}
	
  /*  public User getUserById(long id) {
		
		return userRepository.findById(id);
	}*/

    public User getUserByEmail(String email) {
	
	return userRepository.findByEmail(email);
    }
    
   /* public void deleteUserById(long id)
    {
    	User user= userRepository.findById(id);
		if (user== null) {
			throw new NoSuchUserFoundException("Can not delete project with id : " + id
					+ ". This user does not exist");
		}
		userRepository.delete(user);
    }*/


}
