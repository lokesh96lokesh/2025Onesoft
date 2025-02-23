package postLoops;

public class WhileCountVowels {
	public static void main(String[] args) {
		String a = "australia";
		int i = 0;
		int c = 0;
		while(i < a.length()) {
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' ||
					a.charAt(i) == 'o' || a.charAt(i) == 'u') {
				c++;
					}
			i++;
		}
		System.out.println(c);
	}

}

