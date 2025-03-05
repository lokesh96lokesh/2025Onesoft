package Function;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Part";
		String s2="trap";
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(isAnagram(c1,c2))
			System.out.println("Anagram");
		else
			System.out.println("Not a Anagram");
		
	}

	public static boolean isAnagram(char[] c1, char[] c2) {
		int count=0;
		boolean res=false;
		if(c1.length!=c2.length)
			return false;
		else{
			for(int i=0;i<c2.length;i++) {
				if(c1[i]==c2[i])
					count++;
			}
		}
		if(count==c1.length) {
			res=true;
			return res;
		}
		else
			return res;
		
	}

}
