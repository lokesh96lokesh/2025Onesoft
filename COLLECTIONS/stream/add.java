package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class add {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();
	nums.add(9);
	nums.add(23);
	nums.add(78);
	nums.add(75);
	nums.stream().forEach(x->System.out.println(x));
	
	nums.stream().filter(x->x%2 == 0).forEach(x->System.out.println(x));
	
	long countVal = nums.stream().count();
	System.out.println(countVal);
	
	List<Integer> numss = nums.stream().collect(Collectors.toList());
	System.out.println(numss);
}
}
