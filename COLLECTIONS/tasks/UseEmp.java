package tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class UseEmp {
	public static void main(String[] args) {
		Emp e1 = new Emp("B11","Saro",30000,30);
		Emp e2 = new Emp("B12","Ranga",25000,25);
		Emp e3 = new Emp("B13","Pradeep",22000,24);
		Emp e4 = new Emp("B9","Ragu",40000,30);
		ArrayList<Emp> a = new ArrayList<>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		Optional<Emp> d = a.stream().filter(x->x.getS()>=25000).
				sorted(Comparator.comparingInt(Emp::getA).reversed().
						thenComparing(Comparator.comparing(Emp::getI).reversed())).
				findFirst();
		d.ifPresent(x->System.out.println(x));
	}

}
class Emp { 
	String id;
	String name;
	int salary;
	int age;
	public Emp(String id,String name,int salary,int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
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
	public void setS(int salary) {
		this.salary = salary;
	}
	public int getS() {
		return salary;
	}
	public void setA(int age) {
		this.age = age;
	}
	public int getA() {
		return age;
	}
	public String toString() {
		return "ID: "+id+" NAME: "+name+" SALARY: "+salary+" AGE: "+age;
	}
}
