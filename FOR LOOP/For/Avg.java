package For;

public class Avg {

public static void main (String[]args) {
	int[] a  = {2,4,6,8,10};
	int total = 0;
	int count = 0;
	int avg = 0;
	for (int i = 0; i<a.length; i++) {
		total = total+a[i];
		count = count+1;
		avg = total/count;
	}
	System.out.println(total+" "+avg);
}
}

