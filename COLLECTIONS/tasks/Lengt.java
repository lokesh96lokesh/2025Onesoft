package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lengt {
	public static void main(String[] args) {
		String[] a = {"Nisha","Saro","Ranga","Prad"};
		ArrayList<String> b = new ArrayList<>();
		for(String c : a) {
			b.add(c);
		}
		List<String> d = b.stream().map(x-> x+"-"+x.length()).collect(Collectors.toList());
		System.out.println(d);
		}
		//Arrays.stream(a).map(x-> x+" "+x.length()).forEach(x->System.out.println(x));
	}

