package com.MyWebApp.Controller;

	import java.util.ArrayList;

	import java.util.Arrays;
	import java.util.List;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.bind.annotation.RequestParam;

	@RestController
	@RequestMapping(value = "/webapp")
	public class MyWebAppController {
		//http://localhost:8080/get
		@GetMapping(value = "/get")
		public String getWord() {
			return "HelloWorld \t Java........";
		}
		
		//http://localhost:8080/get1
		@GetMapping(value = "/get1")
		public String getWord1() {
			return "Bye World.......";
		}
		//http://localhost:8080/webapp/getname/loki
		@GetMapping(value = "/getname/{j}")
		public String getMethodName(@PathVariable String j) {
			return "My Name is "+j;
		}
		//http://localhost:8080/webapp/getjoin/jeeva/nandham
		@GetMapping(value ="/getjoin/{j}/{m}") 
		public String getjoin(@PathVariable String j,@PathVariable int m) {
			return "My name is: "+j+" salary: "+m;
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
		//http://localhost:8080/webapp/getAccess?username=loki&Password=123
		@GetMapping(value ="getAccess")
		public String getThis(@RequestParam String username,@RequestParam String Password) {
			if(username.equals("loki")&&Password.equals("123"))
				return "Access Allowed";
			else
				return "Access Denied";
				
		}
		
		//Print Ascii
//		@GetMapping(value="getAscii/{a}")
//		public int Ascii(@PathVariable String a) {
//			char b[]=a.toCharArray();
//			int c;
//			for(int i=0;i<b.length;i++) {
//				 c=b[i];
//			}
//			return "Ascii value"+c;
//		}
		
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
		
		
	}	

