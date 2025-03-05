package Function1;

import java.util.Arrays;
import java.util.List;

public class SumCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
        System.out.println("Sum: " + sumOfList(numbers));
    }
        
        public static int sumOfList(List<Integer> numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
    }
}