package streams_task;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElements {

	    public static void main(String[] args) {
	        Integer[] a = {1, 5, 6, 8, 9};
	        Integer[] b = {6, 9, 3, 4};

	        Set<Integer> common = Arrays.stream(a)
	            .filter(Arrays.asList(b)::contains)
	            .collect(Collectors.toSet());

	        System.out.println("Common Elements: " + common);
	    }
	}

