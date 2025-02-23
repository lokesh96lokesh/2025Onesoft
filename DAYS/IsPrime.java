package onesoftday1;

public class IsPrime {
	public static void main(String[] args) {
		int a=1,b=10;
		for(int i=a;i<=b;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
				}
			}
			if(isPrime && i>=2) {
				System.out.println(i);
			}
		}
	}

}
