package postLoops;

public class FirstChar {
	public static void main(String[] args) {
		String a = "raviraj";
		char f = a.charAt(0);
		int count = 0;
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i) == f) {
				count++;
			}
		}
		System.out.println(f+"="+count);
	}

}
