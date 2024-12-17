package com.springboot1.springboot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Engine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int engId;
	private double engprice;
	public int getEngId() {
		return engId;
	}
	public void setEngId(int engId) {
		this.engId = engId;
	}
	public double getEngprice() {
		return engprice;
	}
	public void setEngprice(double engprice) {
		this.engprice = engprice;
	}
	@Override
	public String toString() {
		return "Engine [engId=" + engId + ", engprice=" + engprice + "]";
	}
	public Engine(double engprice) {
		super();
		this.engprice = engprice;
	}
	public Engine() {
		super();
	}
	
}
