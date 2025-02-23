package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseHike {
	public static void main(String[] args) {
		Hike e1 = new Hike("H1","Saro",50000,"Java Developer");
		Hike e2 = new Hike("H2","Ranga",55000,"Java Developer");
		Hike e3 = new Hike("H3","Pradeep",60000,"API Developer");
		ArrayList<Hike> es = new ArrayList<>();
		es.add(e1);
		es.add(e2);
		es.add(e3);
		List<Hike> e = es.stream()
			    .map(x -> {
			        if (x.getR().equals("Java Developer")) { 
			            x.setS(x.getS() + x.getS() * 5/ 100); 
			        }
			        return x;
			    })
			    .collect(Collectors.toList());
		e.forEach(x -> System.out.println(x));

	}
	}
	


class Hike {
	private String id;
	private int salary;
	private String role;
	private String name;
	public Hike(String id,String name,int salary,String role) {
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