package com.springboot1.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot1.springboot.dto.Car;

public interface carrepositery extends JpaRepository<Car, Integer> {

}
