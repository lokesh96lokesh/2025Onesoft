package java8;

import java.util.Optional;

public class Name {
	public static void main(String[] args) throws NameNotFoundException {
		Name n = new Name();
		String[] names = { "Saro", "Kamal", "Ranga" };
//		 String name = "Saro";
		String name = null;
		System.out.println(n.get(names, name).orElseThrow(() -> new NameNotFoundException("JK")));
	}

	public static Optional<String> get(String[] names, String name) {

		for (String nam : names) {

			if (nam.equals(name)) {
				return Optional.of(name);
			} 
		}
			return Optional.empty();

			
		
	}
}

class NameNotFoundException extends Exception {
	public NameNotFoundException(String a) {
		super(a);
	}
}
