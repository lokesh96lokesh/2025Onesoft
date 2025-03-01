package Exception;

public class User {
	public static void main(String[] args)throws LoginException {
		try {
			String user="admin";
		    String password="qwer";
		
		if (user.equals("admin")&& password.equalsIgnoreCase("uiyui")) {
			System.out.println("loged in");
		}
		else {
			throw new LoginException("enter valid passward");
		}
		}
		catch(LoginException e) {
			System.out.println(e);
		}
		
	}

}

class LoginException extends Exception{
	public LoginException (String a) {
		super(a);
	}
}
