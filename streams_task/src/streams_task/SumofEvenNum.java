package streams_task;
import java.util.*;
import java.util.stream.Collectors;

public class SumofEvenNum {
	
		    public static void main(String[] args) {
		        List<Integer> nums = Arrays.asList(10, 20, 30, 07, 9);

		        int evens = nums.stream()
		            .filter(n -> n % 2 == 0)
		            .collect(Collectors.summingInt(n->n));

		        System.out.println("Even numbers: " + evens);
		    }
		}
