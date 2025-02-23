package For22;

public class FirstDup {
	public static void main(String[] args) {
		String a = "Kannan";
		char[] b = a.toCharArray();
		for(int i = 0; i<b.length; i++) {
			int count = 1;
			for(int j = i+1; j<b.length; j++) {
				if(b[i] == b [j]) {
					count++;
					b[j] = '@';
				}
			}
			if(count > 1 && b[i] != '@') {
				System.out.println(b[i]);break;
			}
		}
	}

}
