package functions;

public class Arr {
	public void getOdd(int[] a) {
		for(int i = 0; i<a.length; i++) {
			if(i%2 !=0 ) {
				System.out.println(a[i]);
			}
		}
	}

}
