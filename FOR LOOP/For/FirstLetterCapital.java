package For;

public class FirstLetterCapital {
	public static void main(String[] args) {
//		String[] a = {"my","native","is","chennai"};
		String[] a =args[0].split(" ");
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length(); j++) {
				if(j == 0) {
					System.out.println(a[i].toUpperCase().charAt(0));
				}
				else {
					System.out.println(a[i].charAt(j));
				}
			}
		}
		
	}

}
