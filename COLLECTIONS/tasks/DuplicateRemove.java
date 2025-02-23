package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemove {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();
	nums.add(10);
	nums.add(20);
	nums.add(30);
	nums.add(10);
	nums.add(25);
	List<Integer> num = nums.stream().distinct().collect(Collectors.toList());
	System.out.println(num);
	
}
}
