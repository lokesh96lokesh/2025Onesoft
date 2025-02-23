package for2;

public class RepeatedNonRe {
public static void main(String[] args) {
	String a = "saravanan";
	char[] b = a.toCharArray();
	int repeated = 0;
	int nonrepeated = 0;
	for(int i = 0; i<b.length; i++) {
		boolean isVisit = false;
		int count = 1;
		for(int k = 0; k<i; k++) {
			if(b[i] == b[k]) {
				isVisit = true;
				break;
			}
		}
			if(isVisit) {
				continue;
			}
			for(int j = i+1; j<b.length; j++) {
				if(b[i] == b[j]) {
					count++;
				}
			}
			if(count > 1) {
				repeated++;
			}
			else {
				nonrepeated++;
			}
	}
	System.out.println("Repeated Character : "+repeated+"\n"+
	"Non Repeated Character : "+nonrepeated);
}
}
