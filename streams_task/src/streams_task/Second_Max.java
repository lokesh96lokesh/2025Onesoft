package streams_task;
import java.util.*;



public class Second_Max {
	public static void main(String[] args) {

		        List<Integer> nums = Arrays.asList(10, 20, 30, 25, 40);

		        int secondMax = nums.stream()
		            .sorted(Comparator.reverseOrder())
		            .distinct()
		            .skip(1)
		            .findFirst().get();
		        
		        System.out.println("Second Maximum: " + secondMax);
		        
		        int thirdMax = nums.stream()
			            .sorted(Comparator.reverseOrder())
			            .skip(2)
			            .findFirst().get();
			        
			        System.out.println("third Maximum: " + thirdMax);
	}

}
