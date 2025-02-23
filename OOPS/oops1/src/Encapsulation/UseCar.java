package Encapsulation;

public class UseCar {
public static void main (String[]args) {
	Engine e = new Engine();
	e.setBrand("Oil");
	e.setCc(1400);
	
	Car c = new Car();
	c.setBrand("BMW");
	c.setPrice(100000);
	c.setIsPetrol(false);
	c.setEngin(e);
	System.out.println(c.getBrand()+" "+c.getPrice()+" "+c.getIsPetrol()+" "+
	c.getEngin().getBrand()+" "+c.getEngin().getCc());
  }
}
