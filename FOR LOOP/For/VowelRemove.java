package For;

public class VowelRemove {
	public static void main(String[] args) {
		char[] a = {'i','n','d','i','a'};
		char[] b = {'a','e','i','o','u'};
		for(char c : a) {
			boolean isVowel  = false;
			for(char d : b) {
				if(c == d) {
		isVowel = true;
					break;
				}
			}
			if(!isVowel) {
				System.out.println(c);
			}
		}
	}

}
