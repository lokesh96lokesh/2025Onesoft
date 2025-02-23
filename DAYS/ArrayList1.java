package onesoftday1;
import java.util.ArrayList;


public class ArrayList1 {
	public static void main(String[] args) {
		/*ArrayList<Integer> a=new ArrayList<>();
		a.add(3);
		a.add(2);
		a.add(5);
		a.add(7);
		a.add(9);
		/*
		for (int i=0;i<a.size();i++) {
			boolean isPrime=true;
			for (int j=2;j<a.get(i);j++)
			if(a.get(i)%2==0) {
				isPrime=false;
			}
			if(isPrime==true)
		System.out.println(a.get(i));
		}
		}
		}*/
		   ArrayList<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(30000));
	        employees.add(new Employee(45000));
	        employees.add(new Employee(50000));
	        employees.add(new Employee(60000));

	        for (int i = 0; i < employees.size(); i++) {
	            if (employees.get(i).getSalary() > 40000) {
	                employees.get(i).setSalary(employees.get(i).getSalary() - 2000);
	                System.out.println("Updated Salary: " + employees.get(i).getSalary());
	            }
	            else if(employees.get(i).getSalary() > 20000) {
	                employees.get(i).setSalary(employees.get(i).getSalary() - 1000);
	                System.out.println("Updated Salary: " + employees.get(i).getSalary());
	            }
	        }
	        ArrayList<Integer> salaryList = new ArrayList<>();
	        employees.forEach(emp -> salaryList.add(emp.getSalary()));
	        System.out.println("Salaries: " + salaryList);
	}

}
class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
