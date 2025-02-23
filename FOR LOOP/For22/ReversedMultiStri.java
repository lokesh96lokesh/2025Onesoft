package For22;

public class ReversedMultiStri {
	public static void main(String[] args) {
		String a = "I,am,a,developer";
		String[] b = a.split(",");
		String t = "";

		for (int i = 0; i< b.length; i++) {
			for (int j = b[i].length()-1; j >= 0; j--) {
				t = t + b[i].charAt(j);
			}
			if(i < b.length-1) {
				t = t + " ";
			}
		}
			System.out.println(t);
			}

}
