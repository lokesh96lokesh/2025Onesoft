package tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseThirdmax {
	public static void main(String[] args) {
		Thirdmax t1 = new Thirdmax("H1","Saro",50000,"Java Developer");
		Thirdmax t2 = new Thirdmax("H2","Ranga",55000,"Java Developer");
		Thirdmax t3 = new Thirdmax("H3","Pradeep",60000,"API Developer");
		ArrayList<Thirdmax> ts = new ArrayList<>();
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		Thirdmax t = ts.stream().
				sorted(Comparator.comparing(Thirdmax::getS).reversed()).
				skip(2).findFirst().get();
				
		System.out.println(t);

	}
	}

class Thirdmax {
	private String id;
	private int salary;
	private String role;
	private String name;
	public Thirdmax(String id,String name,int salary,String role) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
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
	public void setR(String role) {
		this.role = role;
	}
	public String getR() {
		return role;
	}
	public String toString() {
		return "ID: "+id+" NAME: "+name+" SALARY: "+salary+" ROLE: "+role;
			}
}
