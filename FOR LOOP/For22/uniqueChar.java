package For22;

public class uniqueChar {
	public static void main(String[] args) {
		String a = "simplee";
		char[] b = a.toCharArray();
		boolean isUnique = true;
		for(int i = 0; i<b.length; i++) {
			for(int j = i+1; j<b.length; j++) {
				if(b[i] == b[j] && b[i] !='@') {
					isUnique = false;
					break;
				}
			}
			if(isUnique) {
				System.out.println("Character"); break;
			}
		}
	}

}
