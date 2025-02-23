package tasks;

import java.util.ArrayList;

public class CountLetter {
	public static void main(String[] args) {
		String a = " i am coding";
		ArrayList<Character> b = new ArrayList<>();
		
		for(Character c : a.toCharArray()) {
			b.add(c);
		}
		long d = b.stream().filter(Character :: isLetter).count();
		System.out.println(d);
	}

}