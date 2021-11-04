package com.simpledev.jaxrssbservice.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.springframework.http.HttpStatus;

import com.simpledev.jaxrssbservice.dto.GenericApplicationError;
import com.simpledev.jaxrssbservice.exception.UserNotFoundException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Provider
public class SampleExceptionMapper implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception exception) {
		log.info("in sample exception mapper");
		if (exception instanceof UserNotFoundException) {
			return Response.status(HttpStatus.NOT_FOUND.value())
					.entity(new GenericApplicationError("user not found", "user not found")).build();
		} else {
			return Response.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
					.entity(new GenericApplicationError("Internal server error", "Internal server error")).build();
		}
	}

}
