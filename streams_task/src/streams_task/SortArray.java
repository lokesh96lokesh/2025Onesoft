package streams_task;
import java.util.Arrays;

public class SortArray {

	    public static void main(String[] args) {
	        int[] nums = {5, 2, 8, 3, 1};

	        int[] sortedNums = Arrays.stream(nums).sorted().toArray();

	        System.out.println("Sorted Array: " + Arrays.toString(sortedNums));
	    }
	}

