package OptionalClasses;

import java.util.Optional;

public class OptionalClassSample {
	public static void main(String[] args) {
		String [] str=new String[10];
		//str[5]="JAVA OPTIONAL CLASS EXAMPLE";  //setting value for 5th index 
		
		Optional<String> checkNull=Optional.ofNullable(str[5]);
		
		if(checkNull.isPresent()) {  //isPresent->To check the value is present or not
			String LowcaseStr=str[5].toLowerCase();
			System.out.println(LowcaseStr);
		}
		else
			System.out.println("String value is not present");
	}

}
