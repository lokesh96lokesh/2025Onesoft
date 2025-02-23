package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Eachcha {
	public static void main(String[] args) {
		String a = "Saravanan";		
		ArrayList<Character> c = new ArrayList<>();
		for(Character k : a.toCharArray()) {
			c.add(k);
		}
		Map<Character,Long> count = c.stream().
				collect(Collectors.groupingBy(x->x, Collectors.counting()));
		System.out.println(count);
	}
}