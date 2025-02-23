package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> filteredNames = names.stream()
            .peek(name -> System.out.println("Original: " + name))
            .filter(name -> name.startsWith("A"))                  
            .peek(name -> System.out.println("Filtered: " + name)) 
            .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
