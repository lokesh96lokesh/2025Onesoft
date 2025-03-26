
package com.StudentResult.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.StudentResult.Entity.Results;

public interface ResultRepository extends JpaRepository<Results, Integer>{
	@Query(value = "select * from results where total_marks=(select max(total_marks) from results )",nativeQuery = true)
	public Results getTopper();
	
//	@Query(value = "select * from results where total_marks IN (select distinct total_marks from results ORDER BY total_marks DESC LIMIT 3)", nativeQuery = true)
//	public List<Results> getTopThreeRankers();
	
	@Query(value = "SELECT r.* FROM results r " +
            "JOIN (SELECT DISTINCT total_marks FROM results ORDER BY total_marks DESC LIMIT 3) topMarks " +
            "ON r.total_marks = topMarks.total_marks " +
            "ORDER BY r.total_marks DESC", 
    nativeQuery = true)
	public List<Results> getTopThreeRankers();
	
	@Query(value = "select * from results where total_marks between ? and ?",nativeQuery = true)
	public List<Results> getbetween(int a,int b);

}
