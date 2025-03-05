package java8;

import java.util.Optional;

public class UseTh {

public static void main(String[] args) throws CustomerException {
	String a = null;
	Optional<String> a1 = Optional.ofNullable(a);
	System.out.println(a1.orElseThrow(()-> new CustomerException("KJk")));
}


}

class CustomerException extends Exception {
	public CustomerException(String a) {
	super(a);
}
}