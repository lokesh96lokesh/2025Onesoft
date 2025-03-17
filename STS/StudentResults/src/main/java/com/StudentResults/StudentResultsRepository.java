package com.StudentResults;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentResultsRepository extends JpaRepository<Results, Integer> {
	@Query("SELECT r FROM Results r ORDER BY r.totalMarks DESC LIMIT 3")
    List<Results> getTopThreeRankers();
    @Query("SELECT r FROM Results r WHERE r.totalMarks BETWEEN :min AND :max ORDER BY r.totalMarks DESC")
    List<Results> getStudentsByMarksRange(int min, int max);


}
