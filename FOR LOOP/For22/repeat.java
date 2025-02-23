package For22;

public class repeat {
public static void main (String[]args) {
	String n = "Saravanan";
	char[] a = n.toCharArray();
	int rcount1 = 0;
	int ncount2 = 0;
	for(int i = 0; i<a.length; i++) {
	    int count= 1;
		for(int j = i+1; j<a.length; j++) {
			if(a[i] == a[j]) {
				a[j] = '@';
				count++;
				}
		}
		if(count>1&& a[i] != '@') {
			rcount1=rcount1+count;		}
		else if(count==1 && a[i] != '@') {
			ncount2++;
		}
	}
	System.out.println(rcount1+ " , "+ncount2);
	
  }
}
