package For;

public class NumberPalindrome {
	public static void main(String[] args) {
		int a = 404;
		int b = a;
		int c = 0;
		for(; a > 0;) {
	int d = a % 10;
	c = (c*10)+d;
	a = a/10;			
		}
		if(c == b) {
			System.out.println(c);
		}
	}

}
