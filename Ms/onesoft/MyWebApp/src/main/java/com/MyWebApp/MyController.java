package com.MyWebApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/webapp")
public class MyController {
	static Logger log = Logger.getLogger(MyController.class);
	//http://localhost:8080/get1
	@GetMapping("/get")
	public String getWord() {
		PropertyConfigurator.configure("log4j.properties");
		log.info("HelloWorld");
		return "HelloWorld";
	}
	//http://localhost:8080/get1
	@GetMapping(value = "/get1")
	public String getWord1() {
		PropertyConfigurator.configure("log4j.properties");
		String result= "Bye World.......";
		log.info(result);
		return result;
	}
	//http://localhost:8080/webapp/getname/jeeva
	@GetMapping(value = "/getname/{j}")
	public String getMethodName(@PathVariable String j) {
		PropertyConfigurator.configure("log4j.properties");
		log.info("My Name is "+j);
		return "My Name is "+j;
	}
	//http://localhost:8080/webapp/getjoin/jeeva/nandham
	@GetMapping(value ="/getjoin/{j}/{m}") 
	public String getjoin(@PathVariable String j,@PathVariable String m) {
		PropertyConfigurator.configure("log4j.properties");
		log.fatal("My Full name is "+j+m);
		return "My Full name is "+j+m;
	}
	//http://localhost:8080/webapp/getPrime/1/20
	@GetMapping(value ="/getPrime/{num1}/{num2}")
	public List<Integer> getPrime(@PathVariable int num1,@PathVariable int num2) {
		List<Integer> l = new ArrayList<>();
		PropertyConfigurator.configure("log4j.properties");
		for(int i=num1;i<=num2;i++) {
			boolean prime = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) 
					prime=false;
			}
			if(prime)
				l.add(i);
		}
		log.info(l);
		return l;	
		
	}
	//http://localhost:8080/webapp/getEven/5
	@GetMapping(value ="/getEven/{even}")
	public String getEvenOdd(@PathVariable int even) {
		PropertyConfigurator.configure("log4j.properties");
		if(even%2==0)
		log.fatal("Even Number "+even);
		else
		log.fatal("Odd Number "+even);
		if(even%2==0) 
			return "Even Number "+even;
		else
			return "Odd Numbers "+even;
	}
	//http://localhost:8080/webapp/getAccess?username=Jeeva&Password=Jeeva123
	@GetMapping(value ="getAccess")
	public String getThis(@RequestParam String username,@RequestParam String Password) {
		PropertyConfigurator.configure("log4j.properties");
		if(username.equals("Jeeva")&&Password.equals("Jeeva123")) {
			log.fatal("Access Allowed");
			return "Access Allowed";
		}else {
			log.fatal("Access Denied");
			return "Access Denied";
		}
			
	}
	//Print Ascii
	@GetMapping(value="getAscii/{a}")
	public String Ascii(@PathVariable String a) {
		char b[]=a.toCharArray();
		List<Integer>x=new ArrayList<>();
		PropertyConfigurator.configure("log4j.properties");
		for(int i=0;i<b.length;i++) {
			 x.add((int)b[i]);
		}
		log.fatal("Ascii value"+x);
		return "Ascii value"+x;
	}
	
	//Anagram
	@GetMapping(value ="/Anagram/{a}/{b}")
	public String getAnagram(@PathVariable String a,@PathVariable String b) {
		PropertyConfigurator.configure("log4j.properties");
		String a1=a.toUpperCase();
		String a2=b.toUpperCase();
		char c1[]=a1.toCharArray();
		char c2[]=a2.toCharArray();	
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(isAnagram(c1,c2)) { 
			log.fatal("Anagram");
			return "Anagram";
		}else {
			log.fatal("Not a Anagram");
			return "Not a Anagram";
		}
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
		PropertyConfigurator.configure("log4j.properties");
		for(int i=concat.length()-1;i>=0;i--) {
			rev+=concat.charAt(i);
		}
		log.fatal(rev);
		return rev;
	}
	@GetMapping(value ="/getShirt")
	public String getShirt(@RequestBody Shirt s) {
		PropertyConfigurator.configure("log4j.properties");
		log.fatal(s.getBrand());
		return s.getBrand();
	}
	
	@GetMapping(value ="/getShirts")
	public Shirt getminprice(@RequestBody List<Shirt> s) {
		PropertyConfigurator.configure("log4j.properties");
		log.fatal("for MinPrice Object: "+s.stream().min(Comparator.comparing(Shirt::getPrice)).get());
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
		PropertyConfigurator.configure("log4j.properties");
		log.fatal(findDuplicatesAndUniqueUppercase(input));
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
	










	
