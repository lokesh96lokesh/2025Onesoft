package array;

import java.util.ArrayList;

public class Cha {
	public static void main(String[] args) {
		String a = "m,j,k,l";
		String[] b = a.split(",");
		char c = b[0].charAt(0);
		char d = b[1].charAt(0);
		char e = b[2].charAt(0);
		char f = b[3].charAt(0);
		ArrayList<Character> letters = new ArrayList<> ();
		letters.add(c);
		letters.add(d);
		letters.add(e);
		letters.add(f);
		
		for(int i = 0; i<letters.size(); i++) {
			
			System.out.println(letters.get(i));
		}
	}
}
