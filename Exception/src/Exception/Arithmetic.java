package Exception;

public class Arithmetic {
	public static void main(String[] args) {
		try{
			int a=10;
			String c="10";
		    int b=a/0;
		}
		catch (ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
			
		}
		
	}

}
