package For;

public class Lette {
	public static void main(String[] args) {
		String a = "singapore";
		String b = "gap";
		char[] c = b.toCharArray();
		if(a.contains(b)) {
			System.out.println("OK");
		}
		else if(a.contains("g") && a.contains("a") && a.contains("p")) {
		System.out.println("HF");	
		}
		else if(a.contains("g") || a.contains("a") || a.contains("p")) {
			System.out.println("PK");
		}
		else {
			System.out.println("NG");
		}
	}

}
