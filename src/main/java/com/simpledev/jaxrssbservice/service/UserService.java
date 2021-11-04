package com.simpledev.jaxrssbservice.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpledev.jaxrssbservice.data.UserData;
import com.simpledev.jaxrssbservice.dto.User;

@Service
public class UserService {

	@Autowired
	UserData userData;

	public User getUserById(Long id) {
		return userData.getUserById(id);
	}

	public Collection<User> getAllUsers() {
		return userData.getAllUsers();
	}

}
