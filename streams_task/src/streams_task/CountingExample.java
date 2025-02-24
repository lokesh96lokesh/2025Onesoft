package streams_task;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingExample {

	    public static void main(String[] args) {
	        String str = "HelloWorld";

	        Map<Character, Long> charCount = str.chars()
	            .mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        System.out.println(charCount);
	    }
	}
