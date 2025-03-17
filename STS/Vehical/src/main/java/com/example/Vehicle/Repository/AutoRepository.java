package com.example.Vehicle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Vehicle.Entity.Auto;

public interface AutoRepository extends JpaRepository<Auto, Integer>{
	
	
}
