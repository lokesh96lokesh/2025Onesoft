package functions;

public class Tas {
public void prime (int a) {
	boolean isPrime = true;
	for(int i = 2; i<a; i++) {
		if(a%i == 0) {
			isPrime = false;
		}}
		if(isPrime) {
			System.out.println("is prime");
		}
		else {
			System.out.println("is not prime");
	}
}
}
