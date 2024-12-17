package com.springboot1.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springboot1.springboot.dao.EngineDao;
import com.springboot1.springboot.dto.Car;
import com.springboot1.springboot.dto.Engine;
import com.springboot1.springboot.util.Responsestructure;

@Service
public class EngineServ {
	@Autowired
	EngineDao engd;
	public Responsestructure<Engine> saveeng(Engine eng) {
		Responsestructure<Engine> structure= new Responsestructure<>();
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("car object saved");
		structure.setData(eng);
	
		return structure;
	}
	public Responsestructure<Engine> findById(int engId) {
		
		Engine found= engd.findById(engId);
		if(found!=null) {
			Responsestructure<Engine> structure= new Responsestructure<>();
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setMessage("engine id founded");
			structure.setData(found);
			return structure;		}
		return null;
	}
	
	public Engine updatengine(int engId,Engine engine)
	{
		Responsestructure<Engine> dbengine=findById(engId);
		if(dbengine!=null)
		{
			Responsestructure<Engine> structure= new Responsestructure<>();
			structure.setMessage("engine has been updated");
			structure.setStatus(HttpStatus.CONTINUE.value());
			structure.setData(engine);
		     engine.setEngId(engId);
		     return engd.saveeng(engine);
		}
		return null;
	}
	public Responsestructure<Engine> deletebyid(int engId)
	{
		Responsestructure<Engine> dbengine=findById(engId);
		if(dbengine!=null)
		{
			
			Responsestructure<Engine> structure= new Responsestructure<>();
			structure.setMessage("engine id has been deleted");
			structure.setStatus(HttpStatus.IM_USED.value());
			structure.setData(engd.deletebyid(engId));
			engd.deletebyid(engId);
			return dbengine;
		}
		return null;
	}

}
