package java8;

public class UseEven {
	public static void main(String[] args) {
		int[] a = {2,3,4,5,6,7};
		Even e = ar -> {
			int sum = 0;
			for(int num : ar) {
			if(num % 2 == 0) {
				sum = sum+num;
			}
			}
			return sum;
		};
		System.out.println(e.getSum(a));
	}

}
@FunctionalInterface 

interface Even {
	public int getSum(int[] a);
	public static String getName() {
		return "Saro";
	}
	public default float getWeight() {
		return 63.3f;
	}
}
