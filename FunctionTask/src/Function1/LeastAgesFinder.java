package Function1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeastAgesFinder {

	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee("loki", 28, "Male", 50000),
	            new Employee("Anu", 40, "Female", 60000),
	            new Employee("Mahi", 30, "Male", 55000),
	            new Employee("Sara", 24, "Male", 45000)
	        );

	        System.out.println("Least 3 ages: " + getLeastThreeAges(employees));
	    }
//	    public static List<Integer> getLeastThreeAges(List<Employee> employees) {
//	        List<Integer> ages = new ArrayList<>();
//	        for (Employee e : employees) {
//	            ages.add(e.getAge());
//	        }
//	        Collections.sort(ages);
//	        return ages.subList(0, Math.min(3, ages.size()));
//	    }
	    	public static List<Integer> getLeastThreeAges(List<Employee> employees) {
	    	    List<Integer> ages = new ArrayList<>();
	    	    for (Employee e : employees) {
	    	        ages.add(e.getAge());
	    	    }
	    	    
	    	    Collections.sort(ages);
	    	    
	    	    List<Integer> result = new ArrayList<>();
	    	    for (int i = 0; i < 3 && i < ages.size(); i++) {
	    	        result.add(ages.get(i));
	    	    }
	    	    
	    	    return result;
	    	}
}
