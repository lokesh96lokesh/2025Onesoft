package tasks;

import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
    int a = 10;
    
    generateFibonacciSeries(a).forEach(x->System.out.print(x));
    }
    public static Stream<Integer> generateFibonacciSeries(int a) {
    	return Stream.iterate(new int[] {0,1},pair-> new int[] {pair[1], pair[0]+pair[1]}).
    			limit(a).
    			map(pair->pair[0]);
    	}
    }
