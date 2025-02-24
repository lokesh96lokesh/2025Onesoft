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
		        
		        /*You can achieve the same functionality without using flatMapToInt by 
		         * utilizing flatMap and split("") to break each string into individual characters
		         *  before collecting them into a map. Here's the updated code:
		         */
		        List<String> ncount1 = Arrays.asList("loki", "anu", "Priya");

		        Map<Character, Long> listcharCount1 = ncount1.stream()
		            .flatMap(s -> Arrays.stream(s.split(""))) // Split each string into individual characters
		            .map(s -> s.charAt(0)) // Convert String to Character
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		        System.out.println(listcharCount1);
		    }
}
