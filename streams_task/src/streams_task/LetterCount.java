package streams_task;

public class LetterCount {
	
	    public static void main(String[] args) {
	        String str = "I am coding";

	        long letterCount = str.chars()
	            .filter(Character::isLetter)
	            .count();

	        System.out.println("Letter Count: " + letterCount);
	        
	        
	    }
	}
