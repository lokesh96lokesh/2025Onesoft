package onesoftday1;

public class count {
	public static void main(String[] args) {
		int a=43234433;
		int count=0;
		for(int i=0;i<=a;i++) {
			count++;
			a/=10;
		}
		System.out.println(count);
	}

}
