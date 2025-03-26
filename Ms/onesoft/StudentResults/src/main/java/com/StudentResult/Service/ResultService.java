package com.StudentResult.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.StudentResult.Dao.ResultDao;
import com.StudentResult.Entity.Results;
import com.StudentResult.poojo.StudentDetailsPoojo;
import com.StudentResult.poojo.StudentMarkSeetPoojo;

@Service
public class ResultService {
	@Autowired
	ResultDao rd;
	
	@Autowired
	RestTemplate rt;
	
	public String postValue() {
		String url1="http://localhost:8080/Student/getvalue";//student have attendence
		String url2="http://localhost:8081/markSheet/getAll";//marksheet value
		ResponseEntity<List<StudentDetailsPoojo>> res1 = rt.exchange(url1, HttpMethod.GET,null,
				new ParameterizedTypeReference<List<StudentDetailsPoojo>>() {
				});
		ResponseEntity<List<StudentMarkSeetPoojo>> res2 = rt.exchange(url2, HttpMethod.GET,null,
				new ParameterizedTypeReference<List<StudentMarkSeetPoojo>>() {
				});
		List<StudentDetailsPoojo> studetails = res1.getBody();
		List<StudentMarkSeetPoojo> sheet = res2.getBody();
		List<Results> resultsList = new ArrayList<>();
		
		for (StudentDetailsPoojo student : studetails) {
			StudentMarkSeetPoojo markSheet = sheet.stream()
                    .filter(m -> m.getRollNumber() == student.getRollno())
                    .findFirst()
                    .get();

            if (markSheet != null) {
                int totalMarks = (markSheet.getSem1Total() + markSheet.getSem2Total()) / 2;

                // Add 5 marks if attendance is 90% or more not exceed 100
                if (student.getAttendance() >= 90) {
                    totalMarks = Math.min(totalMarks + 5, 100);
                }
                double percentage = (totalMarks / 100.0) * 100;
                Results finalresult = new Results();
                finalresult.setRollNumber(student.getRollno());
                finalresult.setName(student.getName());
                finalresult.setTotalMarks(totalMarks);
                finalresult.setPercentage(percentage);

                resultsList.add(finalresult);
            }
        }
		return rd.postValue(resultsList);
    }

	public Results getTopper() {
		return rd.getTopper();
	}

	public List<Results> getTopThreeRankers() {
		return rd.getTopThreeRankers();
	}

	public List<Results> getTopThreeRankers1() {
		List<Results> store = rd.getTopThreeRankers1();
		List<Results> collect = store.stream().sorted(Comparator.comparing(Results::getTotalMarks).reversed()).limit(3).collect(Collectors.toList());
		return collect;
	}

	public List<Results> getbetween(int a, int b) {
		return rd.getbetween(a,b);
	}

    	
	
	
	
}

















