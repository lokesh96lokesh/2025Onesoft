package postLoops;

public class OddAdd {
	public static void main(String[] args) {
		String[] a = {"1","3","5","4","6","9","11"};
		int[] b = new int[a.length];
		
		for(int i = 0; i<a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		
		int sum = 0;
		for(int i = 0; i<b.length; i++) {
			if(b[i] % 2 != 0) {
				sum=sum+b[i];
			}
		}
		System.out.println(sum);
	}

}
