package com.springboot1.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot1.springboot.Exception.carnotfountexception;
import com.springboot1.springboot.dto.Car;
import com.springboot1.springboot.dto.Engine;
import com.springboot1.springboot.service.Carservice;
import com.springboot1.springboot.util.Responsestructure;

import jakarta.validation.Valid;
@RestController
@RequestMapping("car")
public class Carcontroller {
	@Autowired
	Carservice cars;
	
	
	@PostMapping
	public ResponseEntity<Responsestructure<Car>> saveacar(@RequestBody @Valid Car car2)
	{
		return cars.savecar(car2);
		
	}
	@GetMapping
	public  ResponseEntity<Responsestructure<Car>> findbyid(@RequestParam int id) throws carnotfountexception
	
	{
		return cars.findById(id);
	}
	@DeleteMapping
	public Responsestructure<Car> deletebyid(int id) 
	{
		return cars.deletebyid(id) ;
		
	}
	
	public  Responsestructure<Car> assigncar(int id,Engine engine)
	{
		return cars.assigncar(id, id);
		
	}

	

}
