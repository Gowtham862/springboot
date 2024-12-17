package com.springboot1.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot1.springboot.Exception.carnotfountexception;
import com.springboot1.springboot.Exception.deleteidnotfounded;
import com.springboot1.springboot.dao.EngineDao;
import com.springboot1.springboot.dao.carDao;
import com.springboot1.springboot.dto.Car;
import com.springboot1.springboot.dto.Engine;
import com.springboot1.springboot.util.Responsestructure;

@Service
public class Carservice {
	@Autowired
	carDao car;
	@Autowired
	EngineDao engine1;
	public ResponseEntity<Responsestructure<Car>> savecar(Car car1) {
		Responsestructure<Car> structure= new Responsestructure<>();
		structure.setData(car.saveCar(car1));
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("car saved");
		return new ResponseEntity<Responsestructure<Car>>(structure,HttpStatus.FOUND);
		
		
	}
	public ResponseEntity< Responsestructure<Car>> findById(int id)    {
		Car found= car.findById(id);
		if(found!=null) {
			Responsestructure<Car> structure= new Responsestructure<>();
			structure.setStatus(HttpStatus.FOUND.value());
			
			structure.setData(car.findById(id));
			structure.setMessage("id founded");
			return new ResponseEntity<Responsestructure<Car>>(structure,HttpStatus.FOUND);
			}
		    throw new carnotfountexception("car not found");
		
	}
	public Responsestructure<Car> assigncar(int id, int engId)
	{
		Car car1=car.findById(id);
		Engine engine=engine1.findById(engId);
		if(car1!=null)
		{
			if(engine!=null)
			{
				Responsestructure<Car> structure= new Responsestructure<>();
				structure.setData(car1);
				structure.setMessage("success fully car assigned");
				structure.setStatus(HttpStatus.OK.value());
				car1.setEngine(engine);
				return structure;
				
			}
		}
		
		return null;
	}
	public Responsestructure<Car> deletebyid(int id) 
	{
		ResponseEntity<Responsestructure<Car>> carf=findById(id);
		if(carf!=null)
		{Responsestructure<Car> structure= new Responsestructure<>();
		structure.setMessage("id deleted");
		structure.setStatus(HttpStatus.ACCEPTED.value());
	    structure.setData(car.deletebyid(id));
		     
		     return structure;
		     
		}
		throw new deleteidnotfounded("delete id not founded");
	}


}
