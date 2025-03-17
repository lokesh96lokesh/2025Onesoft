package com.example.Vehicle.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Vehicle.Dao.CarDao;
import com.example.Vehicle.Entity.Car;

@Service
public class CarService {
	
	@Autowired
	CarDao Ds;
	public String postCar(Car e) {
		return Ds.postCar(e);
	}
	public List<Car> postCarAll(List<Car> c) {
		return Ds.postCar(c);
	}
	public List<Car> getAll() {
		return Ds.getAll();
	}
	public String putCar(int a, Car c) {
		return Ds.putCar(a,c);
	}
	public String patchName(int a, Car c) {
		return Ds.patchName(a,c);
	}
	public List<String> getStream() {
		return Ds.getStream().stream().filter(Car->Car.getPrice()>700000)
				 .map(Car::getBrand).collect(Collectors.toList());
	}
	public List<Car> getSeats(){
		return Ds.getSeats().stream()
				.filter(x->x.getNoOfseats()>4)
				.collect(Collectors.toList());
	}
	public List<Car> getBycarColor(String s) {
		return Ds.getBycarColor(s);
	}
	public int getmaxPrice() {
		return Ds.getmaxPrice();
	}
	public List<Object> getbrandAndcolor(int a, int b) {
		return Ds.getbrandAndcolor(a,b);
	}
	public List<Car> getAsc() {
		return Ds.getAsc();
	}
	public List<Car> getdes() {
		return Ds.getdes();
	}
	public List<Object> getGroup() {
		return Ds.getGroup();
	}
	public int getSum() {
		return Ds.getSum();
	}
	public List<Car> getStart() {
		return Ds.getStart();
	}
	public List<Car> getBycolorJ(String s) {
		return Ds.getBycolorJ(s);
	}
	public int getMaxPriceJ() {
		return Ds.getMaxPriceJ();
	}
	public List<Object> getbrandAndcolorJ(int a,int b) {
		return Ds.getbrandAndcolorJ(a,b);
	}
	

}
