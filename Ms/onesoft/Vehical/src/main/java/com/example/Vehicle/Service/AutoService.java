package com.example.Vehicle.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.comparator.Comparators;

import com.example.Vehicle.Dao.AutoDao;
import com.example.Vehicle.Entity.Auto;

@Service
public class AutoService {
	@Autowired
	AutoDao ad;

	public String postAll(List<Auto> a) {
		return ad.postAll(a);
	}

	public List<Auto> getvalue() {
		return ad.getvalue();
	}

	public List<Auto> getColor(String c) {
		return ad.getvalue().stream()
				.filter(x->x.getFood().equalsIgnoreCase(c))
				.collect(Collectors.toList());
	}

	public List<Integer> getUnique() {
		return ad.getvalue().stream()
				.map(Auto::getModel).distinct()
				.collect(Collectors.toList())
				;
	}

	public List<Auto> getfood() {
		return ad.getvalue().stream()
	            .filter(x -> "Diesel".equals(x.getFood())) 
	            .collect(Collectors.toList());
	}

	public List<Auto> getSorting() {
		return ad.getvalue().stream()
				.sorted(Comparator.comparing(Auto::getWheel))
				.collect(Collectors.toList());
	}

	public Integer getMax() {
		return ad.getvalue().stream()
				.map(x->x.getPrice())
				.max(Comparable::compareTo).get();
	}

	public Auto getmaxobj() {
		return ad.getvalue().stream()
				.max(Comparator.comparing(Auto::getPrice)).get();
	}

	public Integer getsecondMax() {
		return ad.getvalue().stream()
				.map(x->x.getPrice())
				.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	}

	public Auto getmin() {
		return ad.getvalue().stream()
				.min(Comparator.comparing(Auto::getPrice)).get();
	}

	public Auto getsecondMaxobj() {
		return ad.getvalue().stream()
				.sorted(Comparator.comparing(Auto::getPrice).reversed()).skip(1).findFirst().get();
	}

	public Map<String, Long> getgroup() {
		return ad.getvalue().stream()
				.collect(Collectors.groupingBy(x->x.getColor(),Collectors.counting()));
	}
	
}
