package For22;

public class Negative {
public static void main (String[]args) {
	int[] a = {-23,-54,-56,0,34,24,-66,78,-12};
	int count = 0;
	for(int i=0; i<a.length; i++) {
			if(a[i] < 0) {
				count++;
			}
		}
			System.out.println(count);
		}
	}

