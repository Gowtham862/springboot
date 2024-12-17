package com.springboot1.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot1.springboot.dto.Car;
import com.springboot1.springboot.dto.Engine;
import com.springboot1.springboot.repo.EngineRepo;
import com.springboot1.springboot.service.EngineServ;
import com.springboot1.springboot.util.Responsestructure;

@RestController
@RequestMapping("engine")
public class Enginecont {
	@Autowired
	EngineServ engs;
	@Autowired
	EngineRepo Ep;
	@PostMapping
	public Responsestructure<Engine> saveeng(@RequestBody Engine eng) {
		return engs.saveeng(eng);
	}
	@GetMapping
	public Responsestructure<Engine> findById(int engId) {
	
		return engs.findById(engId);
	}
	@DeleteMapping
	public Responsestructure<Engine> deletebyid(int engId)
	{
		
		return engs.deletebyid(engId);
		
	}
	@PutMapping
	public Engine updatebyid(@RequestParam int engId,@RequestBody Engine engine )
	{
		return engs.updatengine(engId, engine);
		
	}
	@GetMapping("hi")
	public List <Engine> findbyall()
	{
		return Ep.findAll();
		
	}
	
	
	
}
