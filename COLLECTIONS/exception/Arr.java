package exception;

public class Arr {
public static void main(String[] args) {
	System.out.println("Intialized");
	String[] a = {null,"Ranga","Devi"};
	try {
		char b = a[0].toUpperCase().charAt(2);
		System.out.println(b);
	}
	catch(NullPointerException d) {
		d.printStackTrace();
	}
	catch(ArrayIndexOutOfBoundsException c) {
		c.printStackTrace();
	}
	catch(StringIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	System.out.println("Excuted");
}
}
