package Constructor;

public class UseCar {
public static void main (String[]args) {
	Engine e = new Engine("Oil",1500);
	Car c = new Car("BMW",1000000,"Blue",e);
	System.out.println(c);
}
}
