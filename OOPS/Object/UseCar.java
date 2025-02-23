package Object;

public class UseCar {
	public static void main(String[]args) {
		Car c1=new Car();
		c1.brand="audi"; 
		c1.price=20000;
		c1.ispetrol=true;
		c1.numberPlate="TN31A0987";
		Car c2=new Car();
		c2.brand="tata";
		c2.price=30000;
		c2.ispetrol=true;
		c2.numberPlate="TN12S2222";
		System.out.println("Car1="+c1.brand+"\n"+c1.price+"\n"+c1.ispetrol+"\n"+c1.numberPlate+"\n"+"\n"+"Car2="+c2.brand+"\n"+c2.price+"\n"+c2.ispetrol+"\n"+c2.numberPlate);
	}

}
