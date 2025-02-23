package postLoops;

public class StringDifference {
public static void main(String[] args) {
	String a = "AMBULANCE";
	String b = "BENCH";
	for(int i = 0; i<a.length(); i++) {
		boolean isFound = false;
		for(int j = 0; j<b.length(); j++) {
			if(a.charAt(i) == b.charAt(j)) {
				isFound = true;
				break;
			}
		}
		if(!isFound) {
			System.out.println(a.charAt(i));
		}
	}
}
}
