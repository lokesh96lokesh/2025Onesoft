package tasks;

import java.util.HashMap;
import java.util.Map;

public class FirstNonDuplicateCharacterForLoop {
    public static void main(String[] args) {
        String input = "swiss";

        Map<Character, Integer> p = new HashMap<>();

        // Count the frequency of each character
        for (char c : input.toCharArray()) {
            p.put(c, p.getOrDefault(c, 0) + 1);
        }

        // Find the first non-duplicated character
        for (char c : input.toCharArray()) {
            if (p.get(c) == 1) {
                System.out.println("First Non-Duplicated Character (For Loop): " + c);
                break;
            }
        }

    }
}