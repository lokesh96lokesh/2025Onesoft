package postLoops;

public class WhileSumOfOdd {
	public static void main(String[] args) {
		String[] a = {"1","2","3","4","5","6"};
		int[] b = new int[a.length];
		for(int i = 0; i<a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		int i = 0;
		int sum = 0;
		while(i < b.length) {
			if(b[i] % 2 != 0) {
				sum = sum + b[i];
			}
			i++;
		}
		System.out.println(sum);
	}

}
