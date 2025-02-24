package streams_task;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConsecutiveNumbers {
	   //condition to avoid the given number
	    public static void main(String[] args) {
	        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        List<Integer> result = nums.stream()
	            .filter(n -> n != 4 && n != 8 && n != 10)
	            .collect(Collectors.toList());

	        System.out.println(result);
	    }
	}
