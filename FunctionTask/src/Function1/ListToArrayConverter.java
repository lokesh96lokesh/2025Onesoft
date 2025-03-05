package Function1;

import java.util.Arrays;
import java.util.List;

public class ListToArrayConverter {

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
	        System.out.println("Array: " + Arrays.toString(convertListToArray(numbers)));
	    }
	    public static Integer[] convertListToArray(List<Integer> list) {
	        return list.toArray(new Integer[0]);
	               //list.stream().toArray(Integer[]::new);
	        
	    }
	    

	}
