package Function;

public class ValidEmail {

	public static void main(String[] args) {
		String mail="loki@gmail.com";
		email(mail);
	}
	public static void email(String mail) {
		if(mail.contains("@gmail.com"))
			System.out.println("Valid mailId");
		else
			System.out.println("Invalid mailId");
	}
	
}
