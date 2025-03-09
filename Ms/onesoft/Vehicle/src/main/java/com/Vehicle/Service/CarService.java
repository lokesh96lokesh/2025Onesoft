package com.Vehicle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Vehicle.Dao.CarDao;
import com.Vehicle.Model.Car;


@Service
public class CarService {
	
	@Autowired 
	CarDao cd;
	@PostMapping("/PostSingleCar")
	public String postCar(@RequestBody Car e) {
		return cd.postCar(e);
	}
	
	@PostMapping("/postAll")
	public List<Car> postCarAll(@RequestBody List<Car> c) {
		return cd.postCarAll(c);
	}
	
	@GetMapping("/getAll")
	public List<Car> getAll() {
		return cd.getAll();
	}
	@PutMapping("/putAll/{a}")
	public String putCar(@PathVariable int a, @RequestBody Car c) {		
		return cd.putCar(a,c);
	}
	@PatchMapping("patchAll/{a}")
	public String patchName(@PathVariable int a,@RequestBody Car c) {
		return cd.patchName(a, c);
	}

}
