package Function;

import java.util.Map;
import java.util.stream.Collectors;

public class Palindrom {
	
	public static void main(String[] args) {
		String str="mam";
		System.out.println(isAnagramOfPalindrome(str));
	}
	public static boolean isAnagramOfPalindrome(String str) {
	    Map<Character, Long> freq = str.chars()
	                                   .mapToObj(c -> (char) c)
	                                   .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	    return freq.values().stream().filter(count -> count % 2 != 0).count() <= 1;
	}

}
