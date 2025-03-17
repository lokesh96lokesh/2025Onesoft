package com.example.Electronics.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.Electronics.Entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	@Query(value = "select * from mobile_details where brand=?",nativeQuery = true)
	public List<Mobile> getbrand(String s);

	@Query(value = "select * from mobile_details where year between ? and ?",nativeQuery = true)
	public List<Mobile> getByyear(int s1, int s2);
	
	@Query(value = "select * from mobile_details where colour=?",nativeQuery = true)
	public List<Mobile> getBycolor(String s);
	
	@Query(value = "select * from mobile_details where model like concat(?, '%')",nativeQuery = true)
	public List<Mobile> getbrandStart(String s);
	
	@Query(value = "select * from mobile_details where storage between ? and ?",nativeQuery = true)
	public List<Mobile> getstorage(int a,int b);
	
	
	
}
