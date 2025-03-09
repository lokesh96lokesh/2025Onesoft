package com.Vehicle.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vehicle.Model.Car;
import com.Vehicle.Service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired 
	CarService cs;
	@PostMapping("/PostSingleCar")
	public String postCar(@RequestBody Car e) {
		return cs.postCar(e);
	}
	
	@PostMapping("/postAll")
	public List<Car> postCarAll(@RequestBody List<Car> c) {
		return cs.postCarAll(c);
	}
	
	@GetMapping("/getAll")
	public List<Car> getAll() {
		return cs.getAll();
	}
	@PutMapping("/putAll/{a}")
	public String putCar(@PathVariable int a, @RequestBody Car c) {		
		return cs.putCar(a,c);
	}
	@PatchMapping("patchAll/{a}")
	public String patchName(@PathVariable int a,@RequestBody Car c) {
		return cs.patchName(a, c);
	}
	
}
