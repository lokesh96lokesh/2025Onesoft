package com.example.Electronics.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Electronics.Entity.Mobile;
import com.example.Electronics.Repository.MobileRepository;

@Repository
public class MobileDao {
	
	@Autowired
	MobileRepository mr;

	public String postmethod(List<Mobile> m) {
		 mr.saveAll(m);
		 return "Saved Successfully";
	}

	public List<Mobile> getmethodname() {
		return mr.findAll();
	}
//exception 
	public List<Mobile> getbrand(String s) {
		return mr.getbrand(s);
	}

	public List<Mobile> getByyear(int s1,int s2) {
		return mr.getByyear(s1,s2);
	}

	public List<Mobile> getBycolor(String s) {
		return mr.getBycolor(s);
	}

	public List<Mobile> getbrandStart(String s) {
		return mr.getbrandStart(s);
	}

	public List<Mobile> getstorage(int a, int b) {
		return mr.getstorage(a,b);
	}

	public String postPrice(Mobile p) {
		 mr.save(p);
		 return "Saved Successfully";
	}
}




