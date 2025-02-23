package for2;

public class RepeatedCharCount {
	public static void main(String[] args) {
		String s = "aabbcc";
		String caps = s.toUpperCase();
		char[] s1 = caps.toCharArray(); 
		for(int i = 0; i<s1.length; i++) {
			int count = 1;
			for(int j = i+1; j<s1.length; j++) {
				if(s1[i] == s1[j]) {
					count++;
					s1[j] = '@';
				}
			}
			if(count > 1 && s1[i] != '@') {
				System.out.println(s1[i]+"="+count);
			}
		}
	}

}
