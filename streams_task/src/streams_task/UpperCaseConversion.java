package streams_task;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseConversion {

	    public static void main(String[] args) {
	        List<String> words = Arrays.asList("aaa", "xxx", "abd", "heg", "ikl");

	        List<String> upperCaseWords = words.stream()
	            .map(String::toUpperCase)
	            .collect(Collectors.toList());

	        System.out.println(upperCaseWords);
	    }
	}

