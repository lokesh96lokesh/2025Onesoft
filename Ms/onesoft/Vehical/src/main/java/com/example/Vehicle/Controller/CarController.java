package com.example.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vehicle.Entity.Car;
import com.example.Vehicle.Service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




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
	public List<Car> postEmpAll(@RequestBody List<Car> c) {
		return cs.postCarAll(c);
	}
	
	@GetMapping("/getAll")
	public List<Car> getMethodName() {
		return cs.getAll();
	}
	@PutMapping("/putAll/{a}")
	public String putMethodName(@PathVariable int a, @RequestBody Car c) {		
		return cs.putCar(a,c);
	}
	@PatchMapping("/patchAll/{a}")
	public String patchName(@PathVariable int a,@RequestBody Car c) {
		return cs.patchName(a, c);
	}
	//using stream
	@GetMapping("/stream")
	public List<String> getMethodName1() {
		return cs.getStream();
	}
	//Seats More than 4 print their Object
	@GetMapping("/seats")
	public List<Car> getSeats() {
		return cs.getSeats();
	}
	//get values form db using Query
	@GetMapping("/getBycarColor/{s}")
	public List<Car> getBycarColor(@PathVariable String s){
		return cs.getBycarColor(s);
	}
	// get max price using Query
	@GetMapping("/getmaxPrice")
	public int getmaxPrice() {
		return cs.getmaxPrice();
	}
	//get brand and price value using query
	@GetMapping("/brandPrice/{a}/{b}")
	public List<Object> getMethodName(@PathVariable int a,@PathVariable int b) {
		return cs.getbrandAndcolor(a,b);
	}
	//get asc using query
	@GetMapping("/getAsc")
	public List<Car> getAsc() {
		return cs.getAsc();
	}
	//get des using query
	@GetMapping("/getdes")
	public List<Car> getdes() {
		return cs.getdes();
	}
	//get color grouping
	@GetMapping("/group")
	public List<Object> getGroup() {
		return cs.getGroup();
	}
	//sum using query
	@GetMapping("/sum")
	public int getSum() {
		return cs.getSum();
	}
	//start with using query
	@GetMapping("/start")
	public Integer getStart() {
		return cs.getStart();
	}
	
	//using jquery 
	@GetMapping("/getBycolorJ/{s}")
	public List<Car> getBycolorJ(@PathVariable String s) {
		return cs.getBycolorJ(s);
	}
	
	@GetMapping("/getMaxPriceJ")
	public int getMaxPriceJ() {
		return cs.getMaxPriceJ();
	}
	@GetMapping("/getbrandAndcolorJ/{a}/{b}")
	public List<Object> getbrandAndcolorJ(@PathVariable int a,@PathVariable int b) {
		return cs.getbrandAndcolorJ(a,b);
	}
	
	
	
}
