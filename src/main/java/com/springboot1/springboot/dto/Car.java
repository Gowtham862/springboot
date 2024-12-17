package com.springboot1.springboot.dto;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	private String carname;
	@Min(value = 120)
	@Max(value=120000)
	private double price;
     @Autowired
	@OneToOne(cascade = CascadeType.ALL)
	private Engine engine;
	public Car() {
		super();
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car( String carname, double price) {
		super();
		
		this.carname = carname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", carname=" + carname + ", price=" + price + "]";
	}
	

}
