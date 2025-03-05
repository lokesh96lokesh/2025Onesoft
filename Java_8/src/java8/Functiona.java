package java8;

public class Functiona {
	public static void main(String[] args) {
		Fun f1 = (a,b) -> a+b;
		System.out.println(f1.getSum(10,20));
		
		Fun f2 = (a,b) -> {
			if(a > b) {
				return a;
			}
			
			else {
				return b;
			}
		};
		System.out.println(f2.getSum(12, 230));
		
			
	}
}

@FunctionalInterface
interface Fun {
	public int getSum(int a,int b);
	public static String getName() {
		return "Saro";
	}
	public default float getWeight() {
		return 63.3f;
	}
}

