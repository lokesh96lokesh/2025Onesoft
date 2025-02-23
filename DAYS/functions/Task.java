package functions;

public class Task {
	public String reverse(String a) {
		String b = " ";
		for(int i = a.length()-1; i>=0; i--) {
			b=b+a.charAt(i);
		}
		return b;
	}

}
