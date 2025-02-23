package For;

public class prime {
public static void main (String[]args) {
	int num =3;
	boolean isPrime = true;
	for (int i = 2; i<num; i++) {
		if (num % i == 0) {
		isPrime = false;
		}
	}
	if (isPrime) {
		System.out.println(num + " is Prime");
	}
	else {
		System.out.println(num + " is not Prime");
	}
}
}
