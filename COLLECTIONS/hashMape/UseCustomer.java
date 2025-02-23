6556package hashMape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseCustomer {
	public static void main(String[] args) {
		Customer c1 = new Customer("Saro",485884947997l,"Male",2000,true);
		Customer c2 = new Customer("Ranga",987654321098l,"Male",2500,true);
		Customer c3 = new Customer("Nisha",123456789012l,"Female",3000,true);
		Customer c4 = new Customer("Praveen",998765432112l,"Male",4000,false);
		Customer c5 = new Customer("Anu",234567890123l,"Female",5000,false);
		Customer c6 = new Customer("Anitha",345678901234l,"Female",5500,false);
		
		HashMap<Long,Customer> hm = new HashMap<>();
		hm.put(c1.getA(),c1);
		hm.put(c2.getA(),c2);
		hm.put(c3.getA(),c3);
		hm.put(c4.getA(),c4);
		hm.put(c5.getA(),c5);
		hm.put(c6.getA(),c6);
		
		for(Long l : hm.keySet()) {
			if(hm.get(l).getG() != "Female") {
				Customer up = hm.get(l);
				Customer u = new Customer("SA",980765432,"Male",3456,true);
				hm.put(l, u);
			}
		}
		for(Long f : hm.keySet()) {
			System.out.println(f+hm.get(f).getN());
		}
		
	//	Iterator<Customer> cu = hm.values().iterator();
	//	while(cu.hasNext()) {
	//		if(cu.next().getG() == "Female") {
	//			cu.remove();
	//		}
	//	}
	//	hm.forEach((x,y)->System.out.println(x+" "+y));
		
	//	for(Customer capital : hm.values()) {
	//		capital.setN(capital.getN().toUpperCase());
	//	System.out.println(capital);
	//	}
		
		//for(Customer r : hm.values()) {
		//	if(r.getN().equals("Saro")) {
		//		r.setN("Paru".toUpperCase());
		//	}
		//}
		//System.out.println(hm);
		
	//	Iterator<Customer> it = hm.values().iterator();
	//	while(it.hasNext()) {
	//		if(it.next().getN().length()%2 == 0) {
	//			it.remove();
	//		}
	//	}
	//		hm.forEach((x,y)->System.out.println(x+" "+y));
				
	
		//Iterator<Customer> itr = hm.values().iterator();
		//while(itr.hasNext()) {
		//	if(itr.next().getP() > 5000) {
			//	itr.remove();
			//}
		///}
		//hm.forEach((x,y)->System.out.println(x+" "+y));
				
		//	ArrayList<Customer> ir = new ArrayList<>();
		//	
		//	for(Customer x:hm.values()) {
		//		if(x.getR()==false) {
		//			ir.add(x);
		//		}				
		//	}
		//	System.out.println(ir);
			
//				}
		//for(Customer b : hm.values()) {
		//	if(b.getR() == true) {
		//		int dis = b.getP()*20/100;
		//		int Amt = b.getP()-dis;
		//		System.out.println(b+" PurchaseAmout-"+Amt);
		//	}
		//}
		
		
		//for(Customer c : hm.values()) {
		//System.out.println(c.getN().toUpperCase()+" "+c);	
		///}
		
		//Customer min  = c1;
		//for(Customer a : hm.values()) {
		//	if(a.getP() < min.getP() && a.getG().equals("Male")) {
		//		min = a;
		//	}
		//}
		//System.out.println(min);
		
		//for(Customer b : hm.values()) {
		//	if(b.getN().length()%2 == 0) {
		//	System.out.println(b.getN().substring(b.getN().length()/2-1,b.getN().length()/2+1));
		//	}
		//	else {
		//		System.out.println(b.getN().charAt(b.getN().length()/2));				
		//	}
		//}
		
		//ArrayList<Long> d = new ArrayList<>(hm.keySet());
		//System.out.println(d);
		
		//for(Customer d : hm.values()) {
		//	if(d.getR() == true) {
		//		System.out.println(d.getA()+" "+d.getN());
		//	}
		//}
		
		//Iterator<Customer> itr = hm.values().iterator();
		//while(itr.hasNext()) {
		//	if(itr.next().getP() < 5000) {
		//		itr.remove();
		//	}
	//	}
		//hm.forEach((x,y)->System.out.println(x+" "+y));

	//	for(Customer s : hm.values()) {
	//	char d = s.getN().charAt(s.getN().length()-1);
	//		System.out.println(d);
	//						}
		
		//Customer max = c1;
		//for(Customer h : hm.values()) {
		//	if(h.getP() > max.getP()) {
		//		max = h;
		//}
	//}
		//		System.out.println(max);
			
		//for(Long z : hm.keySet()) {
		//	System.out.println(z);
		//}
		//for(Customer c : hm.values()) {
		//	System.out.println(c);
		//}
		//for(Long f : hm.keySet()) {
		//	System.out.println(f+" "+hm.get(f));
		//}
		//for(Customer d : hm.values()) {
		//	if(d.getN().length() > 4) {
		//		System.out.println(d);
		//	}
	//	hm.forEach((x,y)->System.out.println(x+" "+y));
	//	hm.keySet().forEach(x->System.out.println(x));
	//	hm.values().forEach(y->System.out.println(y));
	}
}

class Customer {
	String name;
	long aadharNumber;
	String gender;
	int purchaseAmount;
	boolean isRegularCustomer;
	public Customer(String name,long aadharNumber,String gender,int purchaseAmount,boolean isRegularCustomer) {
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.gender = gender;
		this.purchaseAmount = purchaseAmount;
		this.isRegularCustomer = isRegularCustomer;
	
	}
	public void setN(String name) {
		this.name = name;
	}
	public String getN() {
		return name;
	}
	public void setA(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public long getA() {
		return aadharNumber;
	}
	public void setG(String gender) {
		this.gender = gender;
	}
	public String getG() {
		return gender;
	}
	public void setP(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
			}
	public int getP() {
		return purchaseAmount;
	}
	public void setR(boolean isRegularCustomer) {
		this.isRegularCustomer = isRegularCustomer;
	}
	public boolean getR() {
		return isRegularCustomer;
	}
	public String toString() {
		return "Name-"+name+" AadharNumber-"+aadharNumber+" Gender-"+gender
				+" PurchaseAmount-"+purchaseAmount+" RegularCustomer-"+isRegularCustomer;
		
	}
}
