package com.cms.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.entity.User;
import com.cms.repository.UserRepository;


@Service
public class UserServices {

	
	@Autowired UserRepository userRepository;

	@PersistenceContext
    private EntityManager entityManager;
	
    //create user 
	public User createUser(User user) {
		return userRepository.saveAndFlush(user);
	}	
	
	//find all users
	public List<User> findAllUsers(){
		return userRepository.findAll();
		
	}
	
    //find user by id
	public User findUserById(int id) {
		return userRepository.findById(id);
	}
	
	//find by userName equals
	public User findByUserName(String userName) {
		if (userName == null || userName.length() == 0) throw new IllegalArgumentException("The name argument is required");
        TypedQuery<User> q = entityManager.createQuery("SELECT o FROM User AS o WHERE o.userName = :userName", User.class);

        q.setParameter("userName", userName);
		return (User) q;
	}

	//check password is the same user as enter
	public User loginUser(int id, String password) {
		User user = this.findUserById(id);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
		
	}
	
	

}





