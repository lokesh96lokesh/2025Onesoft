package streams_task;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyExample {
	
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

	        int freq = Collections.frequency(numbers, 3);
	        System.out.println("Frequency of 3: " + freq);
	    }
	}
