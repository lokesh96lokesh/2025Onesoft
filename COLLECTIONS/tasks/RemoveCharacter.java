package tasks;

import java.util.stream.Collectors;

public class RemoveCharacter {
    public static void main(String[] args) {
        String a = "Saravanan";
        char b  = 'a';
        String c = a.chars().
        		filter(x->x != b).
        		mapToObj(x-> String.valueOf((char)x)).
        		collect(Collectors.joining());
        System.out.println(c);
    }
}