package For;

public class CharLeng {
public static void main(String[] args) {
	String a = "Applle";
	if(a.length()%2 == 0) {
		System.out.println(a.substring(a.length()/2 -1, a.length()/2 +1));
	}
	else {
		System.out.println(a.charAt(a.length()/2));
	}
}
}
