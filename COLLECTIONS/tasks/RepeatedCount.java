package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatedCount {
	public static void main(String[] args) {
		String a = "saravanan";
		ArrayList<Character> c = new ArrayList<>();
		
		for(char b : a.toCharArray()) {
			c.add(b);
		}
		long d = c.stream().count();
		long r = c.stream().
				collect(Collectors.groupingBy(x->x, Collectors.counting())).
				values().stream().
				filter(x-> x>1).count();
				
		System.out.println("Overall Count: "+d+" Repeated Count: "+r);
	}

}
