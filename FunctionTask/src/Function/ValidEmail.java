package Function;

public class ValidEmail {

	public static void main(String[] args) {
		String mail="loki@gmail.com";
		email(mail);
	}
	public static void email(String mail) {
		if(mail.equals("loki@gmail.com"))
			System.out.println("Valid Email Id");
		else
			System.out.println("Invalid Email Id");
	}
	
}
