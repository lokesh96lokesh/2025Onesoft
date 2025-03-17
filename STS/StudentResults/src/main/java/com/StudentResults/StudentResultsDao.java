package com.StudentResults;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class StudentResultsDao {
	@Autowired
	RestTemplate rt;
	
	@Autowired
	StudentResultsRepository sr;

	    
	    public Results saveStudentResult() {
	
				String url2= "http://localhost:8082/StudentMarkSheet/getAll/";
				String url1= "http://localhost:8081/students/getAll";
				
				ResponseEntity<List<Student>>re1=rt.exchange(url1, HttpMethod.GET,null,new ParameterizedTypeReference<List<Student>>() {});
				List<Student> students = re1.getBody();
				
				List<Results> results = new ArrayList<>();
				Results result = new Results();
			
				students.forEach(x -> {
					boolean  has90Attendance= x.getAttendance()>90;
					
					 int re2=rt.exchange(url2+x.getRollNumber(), HttpMethod.GET,null,Integer.class).getBody();
					if (has90Attendance && re2<= 95) {
			            result.setTotalMarks(re2/2+ 5);
			        }
					result.setName(x.getName());
					result.setRollNumber(x.getRollNumber());
					result.setTotalMarks(re2/2);
					result.setPercentage(re2/2);
			        //result.setPercentage(((re2/2) / 100) * 100);
			    	results.add(result);
				}
			);
			 sr.saveAll(results);
			 
			 return result;
	    }
	    
	    public Results getTopper() {
	        return sr.findAll().stream()
	                .max(Comparator.comparing(Results::getTotalMarks))
	                .orElse(null);
	    }

	    public List<Results> getTopThreeRankers() {
	        return sr.getTopThreeRankers();
	    }

	    public List<Results> getStudentsByMarksRange(int min, int max) {
	        return sr.getStudentsByMarksRange(min, max);
	    }


	}
