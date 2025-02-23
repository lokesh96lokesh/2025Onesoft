package Day2;

public class Method11 {
public static void main(String[]args) {
	String value="saravanan";
	char result=value.charAt(4);
	System.out.println(result);
	
	char result1=value.charAt(value.length()-4);
	System.out.println(result1);
	
	
	String name="ranga";
	int ind=name.indexOf("g");
	System.out.println(ind);
	
	String value3="pineappletree";
	String value4=value3.substring(4);
	System.out.println(value4);
	
	String value5=value3.substring(3,12);
	System.out.println(value5);
}
}
