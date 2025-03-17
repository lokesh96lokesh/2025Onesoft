package com.Mobile.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Mobile.Model.Mobile;


public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	@Query(value = "select * from mobiles where brand=?",nativeQuery = true)
	public List<Mobile> getByBrand(String s);
	

@Query(value = "select * from mobiles where year=?",nativeQuery = true)
public List<Mobile> getbyyear(int year);

@Query(value = "select * from mobiles where colour=?",nativeQuery = true)
public List<Mobile> getByColor(String s);

@Query(value = "SELECT * FROM mobiles WHERE model LIKE CONCAT(?,'%')", nativeQuery = true)
List<Mobile> getstartwith( String s);

@Query(value = "select * from mobiles where storage between ? and ? ",nativeQuery = true)
public List<Mobile> getcapacitymorethan64(int a,int b);
}
