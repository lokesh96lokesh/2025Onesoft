package onesoftday1;

public class ReverseWithoutFirstInteger {
	public static void main(String[] args) {
        String str = "abcd1234xyz";
        String modifiedStr = removeFirstInteger(str);
        String reversedStr = reverseString(modifiedStr);
        System.out.println(reversedStr);
    }

    public static String removeFirstInteger(String str) {
        boolean removed = false;
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch) && !removed) {
                removed = true; 
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
