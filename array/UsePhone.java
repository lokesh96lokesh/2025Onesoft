package array;

import java.util.ArrayList;

public class UsePhone {
	public static void main(String[] args) {
		Phone p1 = new Phone("B11","XY",50000,"Yellow",45.5f);
		Phone p2 = new Phone("B12","Y",35000,"Green",55.3f);
		Phone p3 = new Phone("B13","CSFI",67000,"Blue",34.3f);
		Phone p4 = new Phone("B14","BGHKH",22000,"Black",48f);
		Phone p5 = new Phone("B15","JKG",18000,"White",67.9f);
		
		ArrayList<Phone> phones = new ArrayList<> ();
		phones.add(p1);
		phones.add(p2);
		phones.add(p3);
		phones.add(p4);
		phones.add(p5);
	//	Phone max = phones.get(0);
	//	Phone min = phones.get(0);
		
		//System.out.println(phones);
		
		for(int i = 0; i<phones.size(); i++) {
			System.out.println(phones.get(i));
		}
			
		//for(int i = 0; i<phones.size(); i++) {
			//if(phones.get(i).getP() > 30000) {
				//System.out.println(phones.get(i));
			//}
		//for(int i = 0; i<phones.size(); i++) {
			//if(phones.get(i).getP()>max.getP()) {
				//max = phones.get(i);
				//System.out.println(max);
				//}
		//for(int i = 0; i<phones.size(); i++) {
			//if(phones.get(i).getB().length()<min.getB().length()) {
				//min = phones.get(i);
				//System.out.println(min);
			//}
		//for(Phone a : phones) {
			//if(a.getB().length() < min.getB().length()) {
				//min = a;				
		//	}
		//}
	//	System.out.println(min);
		
		//phones.forEach(x->System.out.println(x));		
	}	
}

class Phone {
	private String id;
	private String brand;
	private int price;
	private String color;
	private float weight;
	
	public Phone(String id,String brand,int price,String color,float weight) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.weight = weight;
	}
	public void setI(String id) {
		this.id = id; 
	}
	public String getI() {
		return id;
	}
	public void setB(String brand) {
		this.brand = brand;
	}
	public String getB() {
		return brand;
	}
	public void setP(int price) {
		this.price = price;
	}
	public int getP() {
		return price;
	}
	public void setC(String color) {
		this.color=color;
	}
	public String getC() {
		return color;
	}
	public void setW(float weight) {
		this.weight = weight;
	}
	public float getW() {
		return weight;
	}
	public String toString() {
		return "Id: "+id+", Brand: "+brand+", Price: "+price+", Color: "+color+", Weight: "+weight;
	}
}
