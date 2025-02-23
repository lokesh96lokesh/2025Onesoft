package tasks;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DuplicatesStream {
	public static void main(String[] args) {
		String a = "Saravanan";
		ArrayList<Character> b = new ArrayList<>();
		for(char c : a.toCharArray() ) {
			b.add(c);
		}
		b.stream().
		collect(Collectors.groupingBy(x->x, Collectors.counting())).
		entrySet().stream().
		filter(entry -> entry.getValue() > 1).
		forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));
	}

}
