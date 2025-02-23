package postLoops;

public class Square {
public static void main(String[] args) {
	int a = 16;
	if(a < 0) {
		System.out.println("INVALID");
	}
	else {
		
	boolean isPerfect = false;
	for(int i = 1; i<=a/2; i++) {
		if(i*i == a) {
			isPerfect = true;
			break;
		}
	}
	if(isPerfect) {
		System.out.println("SQUARE");
	}
	else {
		System.out.println("NOT A SQUARE");
	}
	}
}
}
