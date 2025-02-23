package Itrator;

import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("loki",28,70000,4,true,"dev");
		Employee e2=new Employee("priya",23,67384,3,false,"tester");
		Employee e3=new Employee("anu",35,92635,2,false,"dev");
		Employee e4=new Employee("joe",31,24563,1,false,"tester");
		Employee e5=new Employee("john",27,93534,5,true,"dev");
		
		HashMap<Integer,Employee> empdetail=new HashMap<>();
		empdetail.put(e1.getExp(),e1);
		empdetail.put(e2.getExp(),e2);
		empdetail.put(e3.getExp(),e3);
		empdetail.put(e4.getExp(),e4);
		empdetail.put(e5.getExp(),e5);
		
		//Employee max= e1;
		
		/*for(Employee x:empdetail.values()) {
			if (x.getSalary()>max.getSalary()) {
				max=x;
			}
		}
		System.out.println(max);
		*/
		/*for(Integer x:empdetail.keySet()) {
			if (empdetail.get(x).getExp()>max.getExp()) {
				max=empdetail.get(x);
			}
		}
		System.out.println(max);
		*/
		/*
		for(Employee x:empdetail.values()) {
			if (x.getExp()>2) {
				x.setSalary(x.getSalary()+2000);
			}
		}
		System.out.println(empdetail);
		*/
		
		/*for(Integer x:empdetail.keySet()) {
			if (empdetail.get(x).getAge()>30) {
				
				System.out.println(empdetail.get(x).getName());
			}
		}
		*/
		
		//empdetail.values().forEach(x->System.out.println(x));
		
		/*for(Integer e:empdetail.keySet()) {
			System.out.println(e+" "+empdetail.get(e));
		}
		System.out.println("");
		for(Employee e:empdetail.values()) {
			System.out.println(e.getName());
		}*/
		//empdetail.values().forEach(x->System.out.println(x));
		
		//empdetail.keySet().forEach(x->System.out.println(x+" "+empdetail.get(x)));


	}

}
