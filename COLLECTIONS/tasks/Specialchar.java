package tasks;

import java.util.ArrayList;

public class Specialchar {
	public static void main(String[] args) {
		String a = "@123&";
		char[] c = a.toCharArray();
		ArrayList<Character> b = new ArrayList<>();
		b.add(c[0]);
		b.add(c[1]);
		b.add(c[2]);
		b.add(c[3]);
		b.add(c[4]);
		b.stream().filter(x-> !x.equals('1') && !x.equals('2') && !x.equals('3')).
				forEach(x-> System.out.print(x));
	}

}
