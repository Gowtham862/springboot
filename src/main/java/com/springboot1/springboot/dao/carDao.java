package com.springboot1.springboot.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot1.springboot.dto.Car;
import com.springboot1.springboot.dto.Engine;
import com.springboot1.springboot.repo.carrepositery;

@Repository
public class carDao {
	@Autowired
	carrepositery carrep;
	
	public Car saveCar(Car car) {
		return carrep.save(car);
	}
	public Car findById(int id) {
		Optional<Car> opt= carrep.findById(id);
		if(opt.isPresent()) {
			return opt.get();		}
		return null;
	}
	public Car deletebyid(int id)
	{
		Car carfound=findById(id);
		if(carfound!=null)
		{
			carrep.deleteById(id);
			
		}
		return null;
	}
		
	}



