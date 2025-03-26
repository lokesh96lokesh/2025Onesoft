package com.example.Vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Vehicle.Entity.Auto;
import com.example.Vehicle.Repository.AutoRepository;

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
}
