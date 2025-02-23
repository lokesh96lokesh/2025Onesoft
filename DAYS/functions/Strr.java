package functions;

public class Strr {
public void getEven(String[] a) {
	for(int i = 0; i<a.length; i++) {
		if(a[i].length()%2 == 0) {
			System.out.println(a[i]+"Even");
		}
		else { 
			System.out.println(a[i]+"Odd");
		}
	}
}
}
