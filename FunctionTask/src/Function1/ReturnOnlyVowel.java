package Function1;

public class ReturnOnlyVowel {

	    public static void main(String[] args) {
	        String input = "Hello World";
	        System.out.println("Vowels: " + extractVowels(input));
	    }
	    public static String extractVowels(String input) {
	        StringBuilder result = new StringBuilder();
	        String vowels = "AEIOUaeiou";
	        for (char c : input.toCharArray()) {
	            if (vowels.indexOf(c) != -1) {
	                result.append(c);
	            }
	        }
	        return result.toString();
	    }
	}