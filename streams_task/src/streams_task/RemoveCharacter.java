package streams_task;
import java.util.stream.Collectors;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "hello";
        char toRemove = 'l';

        String result = str.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> c != toRemove)
            .map(String::valueOf)
            .collect(Collectors.joining());

        System.out.println("String after removal: " + result);
    }
}
