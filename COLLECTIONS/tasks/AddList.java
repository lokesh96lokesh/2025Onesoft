package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddList {
    public static void main(String[] args) {
      
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9);
        List<Integer> list3 = Arrays.asList(10, 11, 12, 13);

        List<Integer> mergedList = Stream.concat(Stream.concat(list1.stream(),
        		list2.stream()), list3.stream())
                                        .collect(Collectors.toList());

        int evenSum = mergedList.stream()
                                .filter(num -> num % 2 == 0)
                                .mapToInt(Integer::intValue) 
                                .sum();

       
        int oddSum = mergedList.stream()
                               .filter(num -> num % 2 != 0)
                               .mapToInt(Integer::intValue) 
                               .sum();

       
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}