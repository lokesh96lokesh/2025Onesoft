package postLoops;

public class IncrementalString {
	public static void main(String[] args) {
		String a = "CABLE";
		String b = "";
		for(int i = 0; i<a.length(); i++) {
			b = a.substring(0,i+1);
		System.out.print(b);
	}
	}
}
