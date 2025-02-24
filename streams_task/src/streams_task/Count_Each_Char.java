package streams_task;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;


public class Count_Each_Char {
	public static void main(String[] args) {
		String str= "lokiii";
		        Map<Character, Long> charCount = str.chars()
		            .mapToObj(c -> (char) c)
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		        System.out.println(charCount);
		        
		        
		        //groupingBy(Function.identity() for list of names
		        List<String> ncount = Arrays.asList("loki", "anu", "Priya");

		        Map<Character, Long> listcharCount = ncount.stream()
		            .flatMapToInt(String::chars)  // Convert each string to IntStream of characters
		            .mapToObj(c -> (char) c)      // Convert int to Character
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		        System.out.println(listcharCount);
		    }
}
