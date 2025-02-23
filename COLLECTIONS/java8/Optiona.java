package java8;

import java.util.Optional;

public class Optiona {
public static void main(String[] args) {
	String a = "Rah";
	String b = null;
	Optional<String> a1 = Optional.of(a);
	Optional<String> b1 = Optional.ofNullable(b);
	System.out.println(a1+"\n"+b1);
	System.out.println(a1.isPresent());
	System.out.println(b1.isPresent());
	System.out.println(a1.isEmpty());
	System.out.println(b1.isEmpty());
	System.out.println(a1.orElse("Java"));
	System.out.println(b1.orElse("Java"));
	System.out.println(a1.orElseThrow());
//	System.out.println(b1.orElseThrow());
	System.out.println(b1.orElseThrow(() -> new RuntimeException()));
}
}
