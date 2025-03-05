package Function;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		float celsius=10.5f;
		System.out.println(Fahrenheit(celsius));
	}
	public  static float Fahrenheit(float celsius) {
		float fahrenheit=(celsius*9/5)+32;
		return fahrenheit;
	}
}
