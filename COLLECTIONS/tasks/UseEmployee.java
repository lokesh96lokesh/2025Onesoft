package tasks;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("B11","Saro","MECH");
		Employee e2 = new Employee("B12","Ranga","CIVIL");
		Employee e3 = new Employee("B13","Pradeep","ECE");
		Employee e4 = new Employee("B14","Ragu","MECH");
		ArrayList<Employee> a = new ArrayList<>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		long c = a.stream().filter(x->x.getD().equals("MECH")).count();
		System.out.println(c);
	}

}
class Employee { 
	String id;
	String name;
	String dept;
	public Employee(String id,String name,String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public void setI(String id) {
		this.id = id;
	}
	public String getI() {
		return id;
	}
	public void setN(String name) {
		this.name = name;
	}
	public String getN() {
		return name;
	}
	public void setD(String dept) {
		this.dept = dept;
	}
	public String getD() {
		return dept;
	}
	public String toString() {
		return "ID: "+id+" NAME: "+name+" DEPT: "+dept;
	}
}