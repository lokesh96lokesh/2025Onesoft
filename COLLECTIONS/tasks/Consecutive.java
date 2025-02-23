package tasks;

import java.util.Arrays;

public class Consecutive {
    public static void main(String[] args) {
       
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(a)
                .filter(num -> num == 4 || num == 8 || num == 10)
                .forEach(x->System.out.println(x));
    }
}
