package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UsePhone {
	public static void main(String[] args) {
		Phone p1 = new Phone("B11","XY",50000,"Yellow",45.5f);
		Phone p2 = new Phone("B12","Y",35000,"Green",55.3f);
		Phone p3 = new Phone("B13","CSFI",67000,"Blue",34.3f);
		Phone p4 = new Phone("B14","BGHKH",18000,"Black",48f);
		Phone p5 = new Phone("B15","JKG",18000,"White",67.9f);
		
		ArrayList<Phone> phones = new ArrayList<> ();
		phones.add(p1);
		phones.add(p2);
		phones.add(p3);
		phones.add(p4);
		phones.add(p5);
		
		int secondMax = phones.stream().map(x->x.getP()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondMax);
		
		//Set<String> setId = phones.stream().map(x->x.getI()).collect(Collectors.toSet());
		//System.out.println(setId);
		
		//Map<String,Phone> mapPhones = phones.stream().collect(Collectors.toMap(x->x.getI(), y->y));
		//System.out.println(mapPhones);
		
		
		//List<Integer> minPrice = phones.stream().map(x->x.getP()).distinct().collect(Collectors.toList());
		//System.out.println(minPrice);
		
		//int rev = phones.stream().map(x->x.getP()).sorted(Comparator.reverseOrder()).findFirst().get();
		//System.out.println(rev);
		
		//int findF = phones.stream().map(x->x.getP()).sorted().findFirst().get();
		//System.out.println(findF);
		
		//List<Integer> skipl = phones.stream().map(x->x.getP()).sorted().skip(4).collect(Collectors.toList());
		//System.out.println(skipl);
		
		//List<Integer> limitr = phones.stream().map(x->x.getP()).sorted().limit(2).collect(Collectors.toList());
		//System.out.println(limitr);
		
		//Phone min = phones.stream().min(Comparator.comparingInt(Phone::getP)).get();
		//System.out.println(min);
		
		//Phone max = phones.stream().max(Comparator.comparingInt(Phone::getP)).get();
		//System.out.println(max);
		
		//List<Phone>sortingds = phones.stream().sorted(Comparator.comparing(Phone::getP).reversed()).collect(Collectors.toList());
		//System.out.println(sortingds);
		
		//List<Phone> sortingas = phones.stream().sorted(Comparator.comparing(Phone::getP)).collect(Collectors.toList());
		//System.out.println(sortingas);
		
		//List<String> brands = phones.stream().map(x->x.getB()).collect(Collectors.toList());
		//System.out.println(brands);
		
		//List<Phone> phonesPrice = phones.stream().filter(x->x.getP() > 30000).collect(Collectors.toList());
		//System.out.println(phonesPrice);
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
