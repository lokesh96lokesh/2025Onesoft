package streams_task;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicates {
	

	    public static void main(String[] args) {
	    	int[]  nums = {2, 2, 4, 4, 6, 6, 2, 7, 1, 3, 9};
	        
	        int[] uniqueNums = IntStream.of(nums).distinct().toArray();

	        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNums));
	    }
	}
