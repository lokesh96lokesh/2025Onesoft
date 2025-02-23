package functions;

public class Max {
	int max = 0;
public void getMax(int[] a) {
	for(int i = 0; i<a.length; i++) {
		if(a[i] > max) {
			max = a[i];
		}
	}
	System.out.println(max);
}
}
