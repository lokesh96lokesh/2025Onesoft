//package com.example.Electronics.Controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//
//public class demo {
//	public String studentResults() {
//		String url1 = "http://localhost:8080/Student/getvalue";
//		String url2 = "http://localhost:8082/studentMarkSheet/getByRollNumber/";
//		List<Results> results = new ArrayList<>();
//
//		ResponseEntity<List<Student>> re1 = rt.exchange(url1, HttpMethod.GET, null,
//				new ParameterizedTypeReference<List<Student>>() {
//				});
//		List<Student> stds = re1.getBody();
//		stds.forEach(i -> {
//			int rn = i.getRollNumber();
//			ResponseEntity<MarkSheet> sp = rt.exchange(url2 + rn, HttpMethod.GET, null,
//					new ParameterizedTypeReference<MarkSheet>() {
//					});
//			MarkSheet spo = sp.getBody();
//			Results res = new Results();
//			res.setRollNumber(i.getRollNumber());
//			res.setName(i.getName());
//			int tot = (spo.getSem1Total() / 2 + spo.getSem2Total() / 2);
//			if (tot <= 95 && i.getAttendance() > 90) {
//				res.setTotalMarks(tot + 5);
//			} else {
//				res.setTotalMarks(tot);
//			}
//			int total = (spo.getSem1Total() + spo.getSem2Total()) / 2;
//
//			res.setPercentage(total / 2);
//
//			results.add(res);
//
//		});
//		return srd.studentResults(results);
//	}
//
//	
//}
package com.StudentResult.Entity;


