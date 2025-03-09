package com.Vehicle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Vehicle.Model.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}
