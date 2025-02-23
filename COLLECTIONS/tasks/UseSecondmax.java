package tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseSecondmax {
	public static void main(String[] args) {
		Secondmax s1 = new Secondmax("H1","Saro",50000,"Java Developer");
		Secondmax s2 = new Secondmax("H2","Ranga",55000,"Java Developer");
		Secondmax s3 = new Secondmax("H3","Pradeep",60000,"API Developer");
		ArrayList<Secondmax> ss = new ArrayList<>();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		//Secondmax s = ss.stream().
			//	sorted(Comparator.comparing(Secondmax::getS).reversed()).
			//	skip(1).findFirst().get();
		
		//List<Secondmax> s = ss.stream().filter(x->String.valueOf(x.getS()).startsWith("5")).				
			//	collect(Collectors.toList());
		
				List<String> s = ss.stream().map(x->x.getS()+"").filter(x->x.startsWith("5")).
					collect(Collectors.toList());
		
		//List<String> s = ss.stream().map(x->x.getS()+" "+x.getI()).collect(Collectors.toList());
		//System.out.println(s);

	}
	}
	


class Secondmax {
	private String id;
	private int salary;
	private String role;
	private String name;
	public Secondmax(String id,String name,int salary,String role) {
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
