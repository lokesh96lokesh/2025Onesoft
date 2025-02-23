package tasks;

import java.util.Arrays;
import java.util.List;

public class SumAsFloat {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        float sumAsFloat = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum as float: " + (float) sumAsFloat);
    }
}