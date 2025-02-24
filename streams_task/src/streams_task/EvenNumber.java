package streams_task;
import java.util.*;
import java.util.stream.Collectors;

public class EvenNumber {
	

	    public static void main(String[] args) {
	        List<Integer> nums = Arrays.asList(10, 20, 30, 07, 9);

	        List<Integer> evens = nums.stream()
	            .filter(n -> n % 2 == 0)
	            .collect(Collectors.toList());

	        System.out.println("Even numbers: " + evens);
	    }
	}
