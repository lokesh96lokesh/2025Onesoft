package streams_task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class fLAT_mAP {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 4, 5, 2, 30);
		List<Integer> l2 = Arrays.asList(3, 1, 30, 10, 4, 30);
		List<List<Integer>> nums = Arrays.asList(l1,l2);
		
		List<Integer>flat=nums.stream()
				.flatMap(x->x.stream())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		flat.forEach(x->System.out.println(x));
	}
}
