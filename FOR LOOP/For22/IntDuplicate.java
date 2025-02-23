package For22;

public class IntDuplicate {
public static void main(String[] args) {
	int[] a = {1,2,2,3,3,5};
	
	for(int i = 0; i<a.length; i++ ) {
		int count = 1;
		for(int j = i+1; j<a.length; j++) {
			if(a[i] == a[j]) {
				count++;
				a[j] = '@';
			}
		}
		if(count > 1) {
			System.out.println(a[i]);
		}
	}
}
}
