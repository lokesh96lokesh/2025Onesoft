package TestForLoop;

public class MaxLnOfW {
public static void main (String[]args) {
	String a = "Saravanan";
	String b = "Rangadurai";
	String c = "Ariyappan";
	String[] d = {a,b,c};
String max = d[0];
	for(int i=0; i<d.length; i++) {
		if(d[i].length() > max.length()) {
			max=d[i];
		}
	}
	System.out.println(max);
}
}
