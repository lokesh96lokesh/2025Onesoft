package onesoftday1;

public class ReverseWords {
	public static void main(String[] args) {
        // Read input from args[0] and split by comma
        String[] words = args[0].split(",");

        // Reverse the order of words and each word itself
        for (int i = 0 ; i <= words.length - 1; i++) {
            String reversedWord = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord += words[i].charAt(j);
            }
            System.out.print(reversedWord + " ");
        }
    }

}
