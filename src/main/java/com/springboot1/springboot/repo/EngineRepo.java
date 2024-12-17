package com.springboot1.springboot.repo;

import java.util.List;

import org.hibernate.annotations.HQLSelect;
import org.hibernate.annotations.processing.HQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.springboot1.springboot.dto.Car;
import com.springboot1.springboot.dto.Engine;


public interface EngineRepo extends JpaRepository<Engine, Integer> {

	
	
	
	
	
	
	
	
	
}
