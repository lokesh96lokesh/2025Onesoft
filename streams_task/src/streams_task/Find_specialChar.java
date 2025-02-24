package streams_task;

import java.util.List;
import java.util.stream.Collectors;

public class Find_specialChar {
	public static void main(String[] args) {
		String a="@123&";
		List<Character>spl=a.chars()
	            .mapToObj(c -> (char) c)
				.filter(c->c=='@')
				.collect(Collectors.toList());
        System.out.println("Find Special values: " + spl);

   

	}

}
