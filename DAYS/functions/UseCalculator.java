package functions;

public class UseCalculator {
public static void main (String[]args) {
	Calculator c = new Calculator();
	System.out.println(c.add());
	System.out.println(c.subtract(24, 6));
	c.multiply();
	c.divide(24,6);
}
}
