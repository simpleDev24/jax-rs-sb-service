package com.simpledev.jaxrssbservice.rest;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.simpledev.jaxrssbservice.dto.User;
import com.simpledev.jaxrssbservice.service.UserService;

@Path("/")
public class UserApi {

	UserService userService;

	public UserApi(UserService userService) {
		this.userService = userService;
	}

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<User> getAllUser() {
		return userService.getAllUsers();
	}

	@GET
	@Path("/users/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserById(@PathParam("userId") Long userId) {
		return userService.getUserById(userId);
	}

}
