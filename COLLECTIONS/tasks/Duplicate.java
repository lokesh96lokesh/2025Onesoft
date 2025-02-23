package tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,20,25,30,10);
		Set<Integer> num = new HashSet<>();
		nums.stream().
		filter(x-> !num.add(x)).distinct().
		collect(Collectors.toList()).forEach(x->System.out.println(x));
		
	}

}