package com.Vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vehicle.Model.Auto;

public interface AutoRepository extends JpaRepository<Auto, Integer>{

	List<Auto> findByPriceGreaterThan(int price);
	
}
