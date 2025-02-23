package for2;

public class Stingmin {
public static void main (String[]args) {
	String[] a = {"JAVA","C++","PYTHON"};
	String min = a[0];
	for( int i=0; i<a.length; i++) {
		if(a[i].length() < min.length()) {
			min = a[i];
		}
	}
	System.out.println(min);
}
}
