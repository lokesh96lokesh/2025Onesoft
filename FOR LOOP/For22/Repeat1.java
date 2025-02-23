package For22;

public class Repeat1 {
public static void main(String[] args) {
	String a = "Sankar";
	char[] b = a.toCharArray();
	for(int i = 0; i<b.length; i++) {
		int count = 0;
		for(int j = i+1; j<b.length; j++) {
			if(b[i] == b[j]) {
		b[j] = '@';
				count++;
			}
		
		if(count>0) {
			System.out.print(b[i]);
		}
	}
}}
}
