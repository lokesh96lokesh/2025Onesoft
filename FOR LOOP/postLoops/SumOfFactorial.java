package postLoops;

public class SumOfFactorial {
	public static void main(String[] args) {
		String a = "2,4,3";
		String[] b = a.split(",");
		int[] c = new int[b.length];
		
		for(int i = 0; i < b.length; i++) {
			c[i] = Integer.parseInt(b[i]);
		}
		
		int sum = 0;
		for(int i = 0; i<c.length; i++) {
			int fact = 1;
			for(int j = 1; j <= c[i]; j++) {
			fact = fact*j;
			}
			sum = sum+fact;
		}
		System.out.println(sum);
	}

}
