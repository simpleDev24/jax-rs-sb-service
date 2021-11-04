package com.simpledev.jaxrssbservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GenericApplicationError {

	private String msg;
	private String details;

}
