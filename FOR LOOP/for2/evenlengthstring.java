package for2;

public class evenlengthstring {
public static void main (String[]args) {
	String[] a = {"Java","C++","PYTHON","SHAS"};
	for(int i =0; i<a.length; i++) {
		if(a[i].length()%2 == 0) {
			System.out.println(a[i]+" Even");
		}
		else {
			System.out.println(a[i]+" Odd");
		}
	}
}
} 
