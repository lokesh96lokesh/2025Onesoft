package streams_task;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicate_Stream {
	
	    public static void main(String[] args) {
	        List<Integer> nums = Arrays.asList(10, 20, 30, 10, 25, 30);
	        
	        Set<Integer> seen = new HashSet<>();
	        Set<Integer> duplicates = nums.stream()
	                                      .filter(n -> !seen.add(n))
	                                      .collect(Collectors.toSet());

	        System.out.println("Duplicate values: " + duplicates);
	        
	        
	        //Remove duplicate
	        List<Integer>rmo=nums.stream().distinct().collect(Collectors.toList());
	        System.out.println("Removed Duplicate values: " + rmo);
	    }
	}


