package streams_task;
import java.util.*;

public class EmployeeFilter {
	
	public static void main(String[] args) {
        List<Employee2> employees = Arrays.asList(
            new Employee2("John", 30, 26000),
            new Employee2("Alice", 25, 24000),
            new Employee2("Mark", 28, 27000),
            new Employee2("Bob", 35, 29000)
        );

        Optional<Employee2> result = employees.stream()
            .filter(emp -> emp.salary >= 25000)
            .sorted(Comparator.comparing(Employee2::getAge).reversed()
                .thenComparing(Employee2::getName, Comparator.reverseOrder()))
            .findFirst();

        result.ifPresent(emp -> System.out.println(emp.name + " - " + emp.salary));
    }
}

	class Employee2 {
	    String name;
	    int age;
	    double salary;
	    
	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		

		Employee2(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }
	}

