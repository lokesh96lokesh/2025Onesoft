package com.example.Vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Vehicle.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

	//using native query its also known as custom query 
	@Query(value="select * from car_details where color=?",nativeQuery=true)
	public List<Car> getBycarColor(String s);
	
	@Query(value="select max(price) from car_details",nativeQuery=true)
	public int getMaxPrice();
	
	@Query(value="select brand, color from car_details where price between ? and ?",nativeQuery=true)
	public List<Object> getbrandAndcolor(int a,int b);
	
	@Query(value="select * from car_details order by price",nativeQuery=true)
	public List<Car> getAsc();

	@Query(value="select * from car_details order by price desc",nativeQuery=true)
	public List<Car> getdes();

	@Query(value="select color,count(color) from car_details group by color",nativeQuery = true)
	public List<Object> getGroup();

	@Query(value = "select sum(no_Ofseats) from car_details",nativeQuery =true)
	public int getSum();
	
	@Query(value = "select * from car_details where brand like 'j%'",nativeQuery = true)
	public List<Car> getStartWith();
	
	
	//using jquery its don't have table name and column name
	//http://localhost:8080/car/getBycolorJ/white
	@Query(value = "select c from Car c where c.color=:c")
	public List<Car> getBycolorJ(@Param("c")String c);
	
	//http://localhost:8080/car/getMaxPriceJ
	@Query(value ="select max(price) from Car c")
	public int getMaxPriceJ();
	
	@Query(value = "select brand,color from Car c where c.price between :x and :y")
	public List<Object> getbrandAndcolorJ(@Param("x") int a,@Param("y") int b);
	
	
}








