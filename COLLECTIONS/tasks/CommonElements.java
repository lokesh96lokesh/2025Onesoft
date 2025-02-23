package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
    public static void main(String[] args) {
    	int[] a = {1,2,3,4,5};
    	int[] b = {2,5,3,6};
    	List<Integer> c = Arrays.stream(a).boxed().collect(Collectors.toList());
    	List<Integer> d = Arrays.stream(b).boxed().collect(Collectors.toList());
    	List<Integer> e = c.stream().
    			filter(d :: contains).
    			collect(Collectors.toList());
    	System.out.println(e);
    }
}