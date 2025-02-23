package For22;

public class Prime1 {
	public static void main(String[] args) {
		int a = 1;
		int b = 10;
		for(int i = a; i < b; i++) {
			if(i == 1) {
				continue;
			}
			boolean isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}

}
