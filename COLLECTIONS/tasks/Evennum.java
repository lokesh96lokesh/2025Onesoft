package tasks;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Evennum {
	private static final String List = null;

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(07);
		a.add(9);
		a.stream().filter(x-> x%2 == 0).forEach(x->System.out.println(x));		
		
	}

}
