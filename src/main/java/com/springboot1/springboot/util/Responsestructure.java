package com.springboot1.springboot.util;

public class Responsestructure<t> {
	t data;
	int status;
	String message;
	
	public t getData() {
		return data;
	}
	public void setData(t data) {
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
