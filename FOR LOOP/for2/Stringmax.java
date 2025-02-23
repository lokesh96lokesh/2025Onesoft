package for2;

public class Stringmax {
public static void main (String[]args) {
	String[] a = {"JAVA","C++","PYTHON"};
	String max = a[0];
	for(int i=0; i<a.length; i++) {
		if(a[i].length() > max.length()) {
			max = a[i];
		}
	}
	System.out.println(max);
}
}
