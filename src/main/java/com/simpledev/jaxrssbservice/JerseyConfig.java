package com.simpledev.jaxrssbservice;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simpledev.jaxrssbservice.exception.mapper.SampleExceptionMapper;
import com.simpledev.jaxrssbservice.rest.UserApi;
import com.simpledev.jaxrssbservice.service.UserService;

@Configuration
public class JerseyConfig {
	
	@Bean
	UserApi userApi(UserService userService) {
		return new UserApi(userService);
	}
	
	@Bean
	SampleExceptionMapper sampleExceptionMapper() {
		return new SampleExceptionMapper();
	}
	
	@Bean
	ResourceConfig config(UserApi userApi, SampleExceptionMapper sampleExceptionMapper) {
		ResourceConfig resourceConfig = new ResourceConfig();
		// register resource endpoint/controller
		resourceConfig.register(userApi);
		// register exception mapper
		resourceConfig.register(sampleExceptionMapper);
		return resourceConfig;
	}

}
