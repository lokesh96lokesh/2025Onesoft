package com.Vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Vehicle.Model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	@Query(value = "select * from car_details where color=?", nativeQuery = true)
	public List<Car> getByColor(String a);

	@Query(value = "select c from Car c where c.price between :a and :b")
	public List<Car> getPriceRange(@Param("a") int a, @Param("b") int b);
	
	@Query(value = "select brand from Car c order by brand desc")
	public List<Car> getBrandRev();
	
	@Query(value = "select c from Car c where price>=:a limit :b offset :c")
	public List<Car> getPriceWithLimitAndSkip(@Param("a") int a, @Param("b") int b,@Param("c") int c);
	
	@Query(value = "select sum(price) from Car c")
	public List<Car> getSumPrice(@Param("a") int a, @Param("b") int b);
}
