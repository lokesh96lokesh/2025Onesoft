package postLoops;

public class Squarevalue {
	public static void main(String[] args) {
		int a = 10;
		for(int i = 1; i <= a/2; i++) {
			boolean isS = false;
			if(i * i == a) {
				isS = true;
				break;
			}
			if(isS) {
				System.out.println(i+ " is square value");				
			}
			else {
				System.out.println(i+" is not a square value");
			}
		}
	}

}
