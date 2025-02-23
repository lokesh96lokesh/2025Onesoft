package For22;

public class ReverseRemoveDigit {
	public static void main(String[] args) {
		String a = "bcd123abc";
		char[] b = a.toCharArray();
		boolean isAvai = true;
		String temp = "";
			for(int i = 0; i<b.length; i++) {			
			if(Character.isDigit(b[i]) && isAvai == true) {
				isAvai = false;
				continue;
			}
			temp = b[i]+temp;
			}
		System.out.println(temp);
	}

}
