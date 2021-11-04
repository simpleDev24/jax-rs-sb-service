package com.simpledev.jaxrssbservice.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.simpledev.jaxrssbservice.dto.User;
import com.simpledev.jaxrssbservice.exception.UserNotFoundException;

@Repository
public class UserData {

	Map<Long, User> userMap = new HashMap<>();

	@PostConstruct
	public void setupUsers() {
		User user = new User(1L, "abc");
		userMap.put(1L, user);
		user = new User(2L, "xyz");
		userMap.put(2L, user);
	}

	public User getUserById(Long id) {
		if (userMap.containsKey(id)) {
			return userMap.get(id);
		} else {
			throw new UserNotFoundException("User does not exists");
		}
	}

	public Collection<User> getAllUsers() {
		return userMap.values();
	}

}
