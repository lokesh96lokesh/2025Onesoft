package For22;

public class DupRe {
public static void main(String[]args) {
	String n = "Saravanan";
	char[] a = n.toCharArray();
	for(int i = 0; i<a.length; i++) {
		int count = 1;
		for(int j = i+1; j<a.length; j++) {
			if(a[i] == a[j]) {
			a[j] = '@';
			count++;
			}
		}
		if(a[i] !='@')
		System.out.print(a[i]);
	}}}