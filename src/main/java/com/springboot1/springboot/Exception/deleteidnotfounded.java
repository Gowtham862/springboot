package com.springboot1.springboot.Exception;

import lombok.Getter;


public class deleteidnotfounded  extends RuntimeException{
	String message;

	public deleteidnotfounded(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	

}
