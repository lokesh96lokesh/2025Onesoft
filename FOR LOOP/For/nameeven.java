package For;

public class nameeven {
public static void main (String[]args) {
	String a = "saravanans";
	for (int i=0; i<a.length(); i++) {
		{
			if (i%2 == 0) {
				System.out.println(a.charAt(i)+" is even");
			}
			else {
				System.out.println(a.charAt(i)+" is odd");
			}
			
		}
	}
}
}
