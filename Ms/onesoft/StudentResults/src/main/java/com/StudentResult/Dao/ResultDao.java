package com.StudentResult.Dao;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentResult.Entity.Results;
import com.StudentResult.Repository.ResultRepository;

@Repository
public class ResultDao {
	@Autowired
	ResultRepository rr;

	public String postValue() {
		
		return null;
	}

	public String postValue(List<Results> resultsList) {
		 rr.saveAll(resultsList);
		 return "Change Successfully";
	}

	public Results getTopper() {
		return rr.getTopper();
	}

	public List<Results> getTopThreeRankers() {
		return rr.getTopThreeRankers();
	}

	public List<Results> getTopThreeRankers1() {
		return rr.findAll();
	}

	public List<Results> getbetween(int a, int b) {
		return rr.getbetween(a, b);
	}
}
