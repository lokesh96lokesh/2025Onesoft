package Function;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		double celsius=10.5;
		System.out.println(Fahrenheit(celsius));
	}
	public  static double Fahrenheit(double celsius) {
		double fahrenheit=(celsius*9/5)+32;
		return fahrenheit;
	}
}
