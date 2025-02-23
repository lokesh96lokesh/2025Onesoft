package array;

import java.util.ArrayList;

public class ChaArr {
	public static void main(String[] args) {
		String a = "m,j,k,l";
		String[] b = a.split(",");
		char[] c = b[0].toCharArray();
		char[] d = b[1].toCharArray();
		char[] e = b[2].toCharArray();
		char[] f = b[3].toCharArray();
		ArrayList<Character> letters = new ArrayList<> ();
		letters.add(c[0]);
		letters.add(d[0]);
		letters.add(e[0]);
		letters.add(f[0]);
		
		for(int i = 0; i<letters.size(); i++) {
			
			System.out.println(letters.get(i));
		}
	}
}
