package Function1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCounter {

	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee("loki", 28, "Male", 50000),
	            new Employee("Anu", 30, "Female", 60000),
	            new Employee("loki", 35, "Male", 55000)
	        );

	        System.out.println("Duplicate Names Count: " + countDuplicateNames(employees));
	        System.out.println("Duplicate Names Count using stream: " + countDuplicateNames1(employees));
	    }
	    public static int countDuplicateNames(List<Employee> employees) {
	        Map<String, Integer> nameCount = new HashMap<>();
	        for (Employee e : employees) {
	            nameCount.put(e.getName(), nameCount.getOrDefault(e.getName(), 0) + 1);
	        }
	        int duplicateCount = 0;
	        for (int count : nameCount.values()) {
	            if (count > 1) {
	                duplicateCount++;
	            }
	        }
	        return duplicateCount;
	    }
	    public static long countDuplicateNames1(List<Employee> employees) {
	        return employees.stream()
	                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
	                .values().stream()
	                .filter(count -> count > 1)
	                .count();
	    }
	}
