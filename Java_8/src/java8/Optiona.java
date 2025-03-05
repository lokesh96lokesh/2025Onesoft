package java8;

import java.util.Optional;

public class Optiona {
public static void main(String[] args) {
	String a = "Rah";
	String b = null;
	int x=0;
	Optional<String> a1 = Optional.of(a);
	Optional<String> b1 = Optional.ofNullable(b);
	Optional<Integer> x1 = Optional.of(x);
	Optional<Integer> y1 = Optional.ofNullable(x);
	System.out.println(x1+"\n"+y1);
	System.out.println(a1+"\n"+b1);
	System.out.println(a1.isPresent());
	System.out.println(b1.isPresent());
	System.out.println(a1.isEmpty());
	System.out.println(b1.isEmpty());
	System.out.println(a1.orElse("Java"));
	System.out.println(b1.orElse("Java"));
	System.out.println("orelsethrow "+a1.orElseThrow());
	System.out.println("orelsethrow "+b1.orElseThrow());
	System.out.println(b1.orElseThrow(() -> new RuntimeException()));
}
}
