package onesoftday1;

import java.util.Arrays;

public class sample {
public static void main(String[] args) {
	        if (args.length > 0) {
	            char[] charArray = args[0].toCharArray();
	            Arrays.sort(charArray); // Sort the characters in ascending order

	            // Print characters with spaces using a for loop
	            for (int i = 0; i < charArray.length; i++) {
	                System.out.print(charArray[i]);
	                if (i < charArray.length - 1) {
	                    System.out.print(" ");
	                }
	            }
	        } else {
	            System.out.println("Please provide input string as command-line argument.");
	        }
	    }
	}
	 /*int num = 123; // Example number
     int sum = 0;

     while (num > 0) {
         sum += num % 10; // Extract last digit and add to sum
         num /= 10;        // Remove last digit
     }

     System.out.println("Sum of digits: " + sum);
}
}*/
	/* String str = "javaaaa";
     int repeated = 0, nonRepeated = 0;

     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         int count = 0;
         for (int j = 0; j < str.length(); j++) {
             if (str.charAt(j) == ch) {
                 count++;
             }
         }
         if (count > 1) {
             repeated++;
         } else {
             nonRepeated++;
         }
     }
     repeated /= 2; 
     System.out.println("Repeated: " + repeated);
     System.out.println("Non-repeated: " + nonRepeated);
}
}
*/
	/*
	String str = "programming";

    System.out.println("Repeated characters:");
    for (int i = 0; i < str.length(); i++) {
        int count = 1;
        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }
        }
        if (count > 1 && str.indexOf(str.charAt(i)) == i) { 
            System.out.println(str.charAt(i)+" "+count);
        }
        
    }
}
}*/
    
    
    
/*	//print the count of repeated and non repeated characters
	
	String x="programminnnng";
	char[] a = x.toCharArray();
	for (int i=0;i<a.length;i++) {
		int count =0;
		for (int j=i+1;j<a.length;j++) {
			if (a[i]==a[j]) {
				a[j] ='@';
				count++;
			
			}
		}
		if(count>0 && a[i] != '@') {
			System.out.println(a[i] +" "+ count);
		}
	}*/
	
	//palindrome
	/*String a= "mAdam";
	String temp="";
	for(int i=a.length()-1;i>=0;i--) {
		temp=temp+a.charAt(i);
	}
	if (a.equalsIgnoreCase(temp)) {
		System.out.println("is a palindrom");
	}
	else {
		System.out.println("not a palindrome");
	}*/

//sum
	/*int a =5;
	int temp=0;
	for (int i=0;i<=a;i++) {
		temp=temp+i;	
	}
	System.out.println(temp);
}*/

