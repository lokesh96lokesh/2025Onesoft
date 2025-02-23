package composition;

public class UseCar {
	public static void main (String[]args) {
		Engine e = new Engine();
		e.brand = "Oil";
		e.cc = 1500;
		
		Car c = new Car();
		c.brand = "BMW";
		c.price = 100000;
		c.isPetrol = false;
		c.engine = e;
		
		System.out.println(c.brand+" "+c.price+" "+c.isPetrol+" "+c.engine.brand+" "+c.engine.cc);
	}

}
