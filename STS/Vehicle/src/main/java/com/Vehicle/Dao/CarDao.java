package com.Vehicle.Dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Vehicle.Model.Car;
import com.Vehicle.Repository.CarRepository;

@Repository
public class CarDao {

	@Autowired
	CarRepository er;
	public String postCar(Car e) {
		er.save(e);
		return "Saved Succefully";
	}
	public List<Car> postCarAll(List<Car> c) {
		er.saveAll(c);
		return er.saveAll(c);
	}
	public List<Car> getAll() {
		return er.findAll();
	}
	public String putCar(int a, Car c) {
		Car byId = er.findById(a).get();
		byId.setBrand(c.getBrand());
		byId.setPrice(c.getPrice());
		byId.setColor(c.getColor());
		byId.setModelYear(c.getModelYear());
		byId.setNoOfseats(c.getNoOfseats());
		 er.save(byId);
		 return "Succefully Updated";
	}
	public String patchName(int a, Car c) {
		Car car = er.findById(a).get();
		car.setNoOfseats(c.getNoOfseats());
		er.save(car);
		return "Patched SuccessFully";
	}
	
	public List<Car> getByColor(String a){
		return er.getByColor(a);
	}
	
	public List<Car> getPriceRange(int a, int b){
		return er.getPriceRange(a,b);
	}

}
