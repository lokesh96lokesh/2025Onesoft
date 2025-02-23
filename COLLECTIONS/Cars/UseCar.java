package onesoftday1.Cars;

public class UseCar {
	public static void main(String[] args) {
		
		Engine e=new Engine();
		e.setBrand("h2h");
		e.setPrice(200);
		
		 Car c1 =new Car();
		 c1.setBrand("bmw");
		 c1.setPrice(2000);
		 c1.setEngine(e);
		 
		 Car c2 =new Car();
		 c2.setBrand("toyoto");
		 c2.setPrice(5000);
		 c2.setEngine(e);
		 
		 Car c3 =new Car();
		 c3.setBrand("audi");
		 c3.setPrice(2000);
		 c3.setEngine(e);
		 
		 Car c4 =new Car();
		 c4.setBrand("svk");
		 c4.setPrice(5000);
		 c4.setEngine(e);
		 
		 Car c5 =new Car();
		 c5.setBrand("polo");
		 c5.setPrice(2000);
		 c5.setEngine(e);
		 
		 Car[] cars = {c1, c2, c3, c4, c5};
	        for (Car car : cars) {
	        	if (car.getPrice() >= 5000) {
	                System.out.println("Car Brand: "+car.getBrand()+", Engine Brand: "+car.getEngine().getBrand());
	            }
	        	
	        }
	}

}
