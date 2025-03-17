package com.Vehicle.Dao;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Vehicle.Model.Auto;
import com.Vehicle.Repository.AutoRepository;

@Repository
public class AutoDao {
	
	@Autowired
	AutoRepository ar;

	public String postAll(List<Auto> a) {
		ar.saveAll(a);
		return "Saved All the Object Successfully";
	}

	public List<Auto> getvalue() {
		return ar.findAll();
	}

	// Fetch Auto objects with price greater than a given value
    public List<Auto> getByPriceGreaterThan(int price) {
        return ar.findByPriceGreaterThan(price);
    }

    // Get distinct Auto objects
    public List<Auto> getDistinctDetails() {
        return ar.findAll().stream().distinct().toList();
    }

    // Get the maximum price of all Autos
    public Integer getMaxPrice() {
        return ar.findAll().stream()
                .map(Auto::getPrice)
                .max(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("No cars available")); 
    }

    // Get the Auto object with the minimum price
    public Optional<Auto> getMinPriceAuto() {
    	    return ar.findAll().stream()
    	            .min(Comparator.comparing(Auto::getPrice));
    	}

    }
