package com.example.Vehicle.Dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Vehicle.Entity.Car;
import com.example.Vehicle.Repository.CarRepository;

@Repository
public class CarDao {

	@Autowired
	CarRepository er;
	public String postCar(Car e) {
		er.save(e);
		return "Saved Succefully";
	}
	public List<Car> postCar(List<Car> c) {
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
	public List<Car> getStream() {
		 return er.findAll();
	}
	public List<Car> getSeats() {
		return er.findAll();
	}
	public List<Car> getBycarColor(String s) {
		return er.getBycarColor(s);
	}
	public int getmaxPrice() {
		return er.getMaxPrice();
	}
	public List<Object> getbrandAndcolor(int a, int b) {
		return er.getbrandAndcolor(a, b);
	}
	public List<Car> getAsc() {
		return er.getAsc();
	}
	public List<Car> getdes() {
		return er.getdes();
	}
	public List<Object> getGroup() {
		return er.getGroup();
	}
	public int getSum() {
		return er.getSum();
	}
	public List<Car> getStart() {
		return er.findAll();
	}
	public List<Car> getBycolorJ(String s) {
		return er.getBycolorJ(s);
	}
	public int getMaxPriceJ() {
		return er.getMaxPriceJ();
	}
	public List<Object> getbrandAndcolorJ(int a, int b) {
		return er.getbrandAndcolorJ(a, b);
	}

}
