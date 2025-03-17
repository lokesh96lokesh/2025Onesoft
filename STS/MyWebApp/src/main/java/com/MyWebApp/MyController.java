package com.MyWebApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/webapp")
public class MyController {
	//http://localhost:8080/get1
	@GetMapping("/get")
	public String getWord() {
		return "HelloWorld \t Java........";
	}
	
	//http://localhost:8080/get1
	@GetMapping(value = "/get1")
	public String getWord1() {
		return "Bye World.......";
	}
	//http://localhost:8080/webapp/getname/jeeva
	@GetMapping(value = "/getname/{j}")
	public String getMethodName(@PathVariable String j) {
		return "My Name is "+j;
	}
	//http://localhost:8080/webapp/getjoin/jeeva/nandham
	@GetMapping(value ="/getjoin/{j}/{m}") 
	public String getjoin(@PathVariable String j,@PathVariable String m) {
		return "My name is "+j+m;
	}
	//http://localhost:8080/webapp/getPrime/1/20
	@GetMapping(value ="getPrime/{num1}/{num2}")
	public List<Integer> getPrime(@PathVariable int num1,@PathVariable int num2) {
		List<Integer> l = new ArrayList<>();
		
		for(int i=num1;i<=num2;i++) {
			boolean prime = true;
			for(int j=2;j<i;j++) {
				if(j%2==0) 
					prime=false;
			}
			if(prime==false)
				l.add(i);
		}
		return l;
		
	}
	//http://localhost:8080/webapp/getEven/5
	@GetMapping(value ="getEven/{even}")
	public String getEvenOdd(@PathVariable int even) {
		if(even%2==0) 
			return "Even Number "+even;
		else
			return "Odd Numbers "+even;
	}
	//http://localhost:8080/webapp/getAccess?username=Jeeva&Password=Jeeva123
	@GetMapping(value ="getAccess")
	public String getThis(@RequestParam String username,@RequestParam String Password) {
		if(username.equals("Jeeva")&&Password.equals("Jeeva123"))
			return "Access Allowed";
		else
			return "Access Denied";
			
	}
	//Print Ascii
//	@GetMapping(value="getAscii/{a}")
//	public String Ascii(@PathVariable String a) {
//		char b[]=a.toCharArray();
////		List<Integer>x=new ArrayList<>();
//		int c;
//		for(int i=0;i<b.length;i++) {
//			 c=b[i];
//		}
//		return "Ascii value"+x;
//	}
//	
	//Anagram
	@GetMapping(value ="/Anagram/{a}/{b}")
	public String getAnagram(@PathVariable String a,@PathVariable String b) {
		String a1=a.toUpperCase();
		String a2=b.toUpperCase();
		char c1[]=a1.toCharArray();
		char c2[]=a2.toCharArray();	
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(isAnagram(c1,c2)) 
			return "Anagram";
		else
			return "Not a Anagram";
	}
	public boolean isAnagram(char c1[],char c2[]) {
		int count=0;
		if(c1.length!=c2.length)
			return false;
		else {
			for(int i=0;i<c1.length;i++) {
				if(c2[i]==c1[i])
					count++;
			}
		}
		if(count==c2.length)
			return true;
		else
			return false;
	}
	
	//LowerToUpperandReverse
	@GetMapping(value ="/reversed/{A}/{B}")
	public String reversed(@PathVariable String A,@PathVariable String B) {
		String a=A.toLowerCase();
		String b=B.toUpperCase();
		String concat=a.concat(b);
		String rev="";
		for(int i=concat.length()-1;i>=0;i--) {
			rev+=concat.charAt(i);
		}
		return rev;
	}
	@GetMapping(value ="/getShirt")
	public String getShirt(@RequestBody Shirt s) {
		return s.getBrand();
	}
	
	@GetMapping(value ="/getShirts")
	public Shirt getminprice(@RequestBody List<Shirt> s) {
		return s.stream().min(Comparator.comparing(Shirt::getPrice)).get();
	}
	
	
	
	@GetMapping("/{day} {month},{year}")
    public String convertDate(@PathVariable String day, @PathVariable String month, @PathVariable String year) {
        String dateString = day + " " + month + "," + year;
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd MMMM,yyyy", Locale.ENGLISH);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date = LocalDate.parse(dateString, inputFormatter);
        return outputFormatter.format(date);
    }
	
	@GetMapping("/{input}")
    public String processString(@PathVariable String input) {
        return findDuplicatesAndUniqueUppercase(input);
    }

    private String findDuplicatesAndUniqueUppercase(String input) {
        StringBuilder duplicates = new StringBuilder();
        LinkedHashSet<Character> uniqueUppercase = new LinkedHashSet<>();
        int[] count = new int[256];

        for (char c : input.toCharArray()) {
            count[c]++;
        }

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c) && count[c] > 1) {
                if (duplicates.indexOf(String.valueOf(c)) == -1) {
                    duplicates.append(c);
                }
            } else if (Character.isUpperCase(c) && count[c] == 1) {
                uniqueUppercase.add(c);
            }
        }

        return duplicates.toString() + uniqueUppercase.toString();
    }

	
}
	










	
