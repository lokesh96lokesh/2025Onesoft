package streams_task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Any_match {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        boolean result = nums.stream()
            .filter(n -> n==2)
            .anyMatch(x-> true);
        System.out.println(result);
        
	    }
		
	}

