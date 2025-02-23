package postLoops;

public class WhileSquare {
	public static void main(String[] args) {
		int a = 16;
		if(a < 0) {
			System.out.println("INVALID");
		}
		else {
			boolean isSQ = false;
			int i = 1;
			while(i < a) {
				if(i*i == a) {
					isSQ = true;
					break;
				}
				i++;
			}
			if(isSQ) {
				System.out.println("SQUARE");
			}
			else {
				System.out.println("NOT SQUARE");
			}
		}
	}

}
