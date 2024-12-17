package com.springboot1.springboot.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.springboot1.springboot.util.Responsestructure;
@RestControllerAdvice
public class exceptionhandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<Responsestructure<String>> carnotfoundexception(carnotfountexception exce)
	{
		Responsestructure<String> structure= new Responsestructure<String>();
		structure.setMessage("id not founded");
		structure.setData(exce.getMessage());
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<Responsestructure<String>>(structure,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler
	public ResponseEntity<Responsestructure<String>> deleteidnotfound(deleteidnotfounded deleid)
	{
		Responsestructure<String> structure= new Responsestructure<String>();
		structure.setMessage(" delete id not founded");
		structure.setData(deleid.getMessage());
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<Responsestructure<String>>(structure,HttpStatus.NOT_FOUND);
		
	}
	

}
