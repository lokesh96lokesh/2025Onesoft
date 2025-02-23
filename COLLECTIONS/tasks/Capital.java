package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Capital {
	public static void main(String[] args) {
		String[] a = {"aaa","bbb","ccc"};
		ArrayList<String> c = new ArrayList<>();
		for(String d : a) {
			c.add(d);
		}
		//String[] b = Arrays.stream(a).map(String :: toUpperCase).toArray(String[] :: new);
		List<String> b = c.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(b);
		}
	}


