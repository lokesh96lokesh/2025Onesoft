package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StringArr {
	public static void main(String[] args) {
		String a = "abndvf";
		List<Character> b = new ArrayList<>();
		for(char c : a.toCharArray()) {
			b.add(c);
		}
		b.stream().sorted();
	}

}
