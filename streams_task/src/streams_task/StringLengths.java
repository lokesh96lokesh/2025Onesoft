package streams_task;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengths {
	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("Nisha", "Kralice", "Demet");

	        List<Integer> lengths = names.stream()
	            .map(String::length)
	            .collect(Collectors.toList());

	        System.out.println("String lengths: " + lengths);
	    }
	}
