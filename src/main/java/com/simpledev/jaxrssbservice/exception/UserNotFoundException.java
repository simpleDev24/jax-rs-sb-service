package com.simpledev.jaxrssbservice.exception;

public class UserNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 3465114860688771918L;
	
	public UserNotFoundException() {
		super();
	}
	
	public UserNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

}
