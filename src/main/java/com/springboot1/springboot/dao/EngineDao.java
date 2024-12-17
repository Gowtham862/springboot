package com.springboot1.springboot.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot1.springboot.dto.Engine;
import com.springboot1.springboot.repo.EngineRepo;

@Repository
public class EngineDao {
	@Autowired
	EngineRepo engr;
	
	public Engine saveeng(Engine eng) {
		return engr.save(eng);
	}
	public Engine findById(int engId) {
		Optional<Engine> opt= engr.findById(engId);
		if(opt.isPresent()) {
			return opt.get();		}
		return null;
	}
	public Engine updatengine(int engId,Engine engine)
	{
		Engine dbengine=findById(engId);
		if(dbengine!=null)
		{
		     engine.setEngId(engId);
		     return engr.save(engine);
		}
		return null;
	}
	public Engine deletebyid(int engId)
	{
		Engine dbengine=findById(engId);
		if(dbengine!=null)
		{
			engr.delete(dbengine);
		}
		return null;
	}
}
