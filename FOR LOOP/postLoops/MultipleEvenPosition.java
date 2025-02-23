package postLoops;

public class MultipleEvenPosition {
	public static void main(String[] args) {
		String[] a = {"1","2","3","5","7","9"};
		int[] b = new int[a.length];
		for(int i = 0; i<a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		int mul = 1;
		for(int i = 1; i<b.length; i++) {
			if(i % 2 != 0) {
				mul = mul * b[i];
			}
		}
		System.out.println(mul);
	}

}
