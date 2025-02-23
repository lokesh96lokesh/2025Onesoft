package Conditions;

public class or {
	public static void main (String[] args) {
		String a = "abcd";
		if (a.contains("a") ||a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
			System.out.println("String contains vowels");
		}
		else 
		{
			System.out.println("no vowels");
		}
	}

}
