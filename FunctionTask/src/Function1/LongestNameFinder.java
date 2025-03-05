package Function1;

import java.util.Arrays;
import java.util.List;

public class LongestNameFinder {

	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee("lokesh", 30, "Male", 50000),
	            new Employee("Anu", 28, "Female", 55000),
	            new Employee("Shiva", 32, "Male", 60000)
	        );

	        Employee longest = getEmployeeWithLongestName(employees);
	        System.out.println("Longest Name Employee: " + longest.getName());
	    }
	    public static Employee getEmployeeWithLongestName(List<Employee> employees) {
	        Employee longestNameEmployee = null;
	        int maxLength = 0;
	        for (Employee e : employees) {
	            if (e.getName().length() > maxLength) {
	                maxLength = e.getName().length();
	                longestNameEmployee = e;
	            }
	        }
	        return longestNameEmployee;
	    }
	}

