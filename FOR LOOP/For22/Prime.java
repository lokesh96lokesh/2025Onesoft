package For22;

public class Prime {
public static void main (String[]args) {
	for(int i=5; i<=10; i++) {
		boolean isPrime = true;
		for(int j=2; j<i; j++) {
			if( i%j == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(i+" is Prime");
		}
		else {
			System.out.println(i+"ia not Prime");
		}
	}
}
}
