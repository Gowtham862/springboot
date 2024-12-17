package com.springboot1.springboot.Exception;

public class carnotfountexception extends RuntimeException {
	
	
	public String getMessage() {
		return message;
	}

	public carnotfountexception(String message) {
		super();
		this.message = message;
	}

	String message;

}
