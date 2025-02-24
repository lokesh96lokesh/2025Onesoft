package streams_task;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeAndSum {
	
	    public static void main(String[] args) {
	        List<Integer> list1 = Arrays.asList(1, 2, 3);
	        List<Integer> list2 = Arrays.asList(4, 5, 6);
	        List<Integer> list3 = Arrays.asList(7, 8, 9);

	        List<Integer> mergedList = Stream.of(list1, list2, list3)
	            .flatMap(List::stream)
	            .collect(Collectors.toList());

	        int evenSum = mergedList.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
	        int oddSum = mergedList.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();

	        System.out.println("Even Sum: " + evenSum + ", Odd Sum: " + oddSum);
	    }
	}

