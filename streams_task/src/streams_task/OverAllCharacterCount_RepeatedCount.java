package streams_task;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OverAllCharacterCount_RepeatedCount {

	    public static void main(String[] args) {
	        String str = "capgemini";

	        Map<Character, Long> charCount = str.chars()
	            .mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        System.out.println("Character Count: " + charCount);
	        System.out.println("all Character Count: " + str.length());
	    }
	}
