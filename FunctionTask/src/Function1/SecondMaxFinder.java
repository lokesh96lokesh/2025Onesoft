package Function1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondMaxFinder {
	 
	    public static void main(String[] args) {
	        Integer[] arr = {5, 3, 8, 1};
	        System.out.println("Second Max: " + secondMax(arr));
	    }
	    public static int secondMax(Integer[] arr) {
//	        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//	        Collections.sort(list, Collections.reverseOrder());
//	        return list.size() > 1 ? list.get(1) : -1;
	        
	        if (arr.length <= 1) {
	            return -1;  
	        }

	        Arrays.sort(arr, Collections.reverseOrder()); 
	        return arr[1]; 
	    }
}
