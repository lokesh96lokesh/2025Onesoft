package onesoftday1;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
	
	
		String input = args[0];  
        String[] name = input.split(","); 
        String result = "";

        for (int i = 0; i < name.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (name[i].equals(name[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result += name[i] + " ";
            }
        }
        System.out.println(result.trim()); 
	}
	}

      /*  // Read input value from args[0]
        String input = args[0];

        // Split the sentence into words
        String[] words = input.split(" ");

        // Array to store unique words
        String[] uniqueWords = new String[words.length];
        int uniqueCount = 0;

        // Iterate through words and add only unique words to the array
        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;

            // Check if the word already exists in uniqueWords array
            for (int j = 0; j < uniqueCount; j++) {
                if (words[i].equals(uniqueWords[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to uniqueWords array
            if (!isDuplicate) {
                uniqueWords[uniqueCount] = words[i];
                uniqueCount++;
            }
        }

        // Print the result as a single sentence without trailing spaces
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueWords[i]);
            if (i < uniqueCount - 1) {
                System.out.print(" "); // Add space between words
            }
        }
    }
}*/
	
		/*
        // Read input value from args[0]
        String input = args[0];

        // Split the sentence into words
        String[] words = input.split(" ");

        // Store unique words in a list
        List<String> uniqueWords = new ArrayList<>();

        // Loop through words and add only unique words to the list
        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }

        // Print the result as a single sentence
        System.out.println(String.join(" ", uniqueWords));
    } 
	}
	*/

