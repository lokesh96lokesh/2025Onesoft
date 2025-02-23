package For22;

public class Arrche {
	public static void main(String[] args) {
		String a = "LABEL";
		char[] a1 = a.toCharArray();
		String b = "BELLA";
		char[] b1 = b.toCharArray();
		for(int i = 0; i<a1.length; i++) {
			int c = 0;
			for(int j = 0; j<b1.length; j++) {
				if(a1[i] == b1[j]) {
					b1[j] = '@';
					c++;
				}
			}
			if(c == 0) {
				System.out.println("ANAGRAM");
			}
		}
	}

}
