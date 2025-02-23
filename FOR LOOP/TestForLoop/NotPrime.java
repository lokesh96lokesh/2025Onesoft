package TestForLoop;

public class NotPrime {
public static void main(String[]args) {
	int a = 26;
	boolean isPrime = true;
	for(int i =2; i<a; i++) {
		if(a%i == 0) {
			isPrime = false; 
		}}
		System.out.println("Prime");
		if(isPrime) {
			System.out.println("Not Prime");
		}
	}
}

