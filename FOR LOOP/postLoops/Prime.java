package postLoops;

public class Prime {
	public static void main(String[] args) {
	//if(args.length == 0) {
	//	System.out.println("INVALID");
	//	return;
	//}
	int a = 8;
	//	if(a < 1) {
		//	System.out.println("INVALID");
		//}
		//else {
			
		for(int i = 0; i <= a; i++) {
			
			if(i < 2 ) {
				System.out.println(i+" INVALID");
				continue;
			}
			
			boolean isPrime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i+" PRIME");
			}
			else {
				System.out.println(i+" NOT PRIME");
			}
		}
	}
}
//}