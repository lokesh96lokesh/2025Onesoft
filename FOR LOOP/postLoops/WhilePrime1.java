package postLoops;

public class WhilePrime1 {
	public static void main(String[] args) {
		int a = 13;
		boolean isPrime = true;
		if(a <= 1) {
			isPrime = false;
		}
		else {
			int i = 2;
		while(i <= a/2) {
			if(a % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		if(isPrime) {
			System.out.println("PRIME");
		}
		else {
			System.out.println("NOT PRIME");
		}
	}
}
}
