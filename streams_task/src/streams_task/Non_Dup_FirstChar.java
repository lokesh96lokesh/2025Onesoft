package streams_task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Non_Dup_FirstChar {
	
	    public static void main(String[] args) {
	        String str = "swiss";

	        Character firstNonRepeated = str.chars()
	            .mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
	            .entrySet()
	            .stream()
	            .filter(entry -> entry.getValue() == 1)
	            .map(Map.Entry::getKey)
	            .findFirst()
	            .orElse(null);

	        System.out.println("First non-duplicate character: " + firstNonRepeated);
	        
	        //for loop
	        for (char c : str.toCharArray()) {
	            if (str.indexOf(c) == str.lastIndexOf(c)) {
	                System.out.println("First non-duplicate character: " + c);
	                return;
	            }
	        }
	        System.out.println("No unique character found.");
	    }
	}
