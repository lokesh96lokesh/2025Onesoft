package Oops2;

public class Hierarchical {
	public static void main (String[] args) {
		Bike b = new Bike();
		b.brand = "TATA";
		b.price = 200000;
		b.color = "Blue";
		b.rpm = 600;
		b.isPetrol = true;
	
    Car c = new Car();
	c.brand = "RADO";
	c.price = 300000;
	c.color = "Green";
	c.rpm = 1200;
	c.isPetrol = true;
	System.out.println(c.brand+" "+c.rpm+" "+c.isPetrol+" "+c.color+" "+c.price+"\n"+b.brand+"-"+
			b.price+"-"+b.color+"-"+b.rpm+"-"+b.isPetrol);
} 
}
class Bike extends Vehicle {
	int rpm;
	boolean isPetrol;
	
}

class Car extends Vehicle {
	int rpm;
	boolean isPetrol;
}

class Vehicle {
	String brand;
	int price;
	String color;
}
