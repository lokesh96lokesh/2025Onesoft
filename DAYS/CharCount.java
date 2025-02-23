package onesoftday1;

public class CharCount {
	 public static void main(String[] args) {
		char[] ch=args[0].toCharArray();
		int repeatedCount = 0, nonRepeatedCount = 0;
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = i+1; j < ch.length; j++) {
            if (ch[i]==ch[j]) {
            	count++;
            	ch[j]='@';
            }
			}
			if(ch[i]!='@' && count>0) {
				repeatedCount++;
            } else if(ch[i]!='@'){
            	nonRepeatedCount++;
            }
		}
		System.out.println("Repeated value count: " + repeatedCount + 
                " Non Repeated value count: " + nonRepeatedCount);
		}
        }
		
	      /*  // Read input value from args[0]
	        String name = args[0];

	        // Create an array to store character frequencies (ASCII assumption)
	        int[] freq = new int[256];

	        // Count frequency of each character using a for loop
	        for (int i = 0; i < name.length(); i++) {
	            freq[name.charAt(i)]++;
	        }

	        int repeatedCount = 0, nonRepeatedCount = 0;

	        // Check for repeated and non-repeated characters
	        for (int i = 0; i < name.length(); i++) {
	            if (freq[name.charAt(i)] > 1) {
	                repeatedCount++;
	            } else {
	                nonRepeatedCount++;
	            }
	        }

	        // Since repeated characters are counted multiple times, we need to remove duplicates
	        repeatedCount /= 2;

	        // Print the result
	        System.out.println("Repeated value count: " + repeatedCount + 
	                           " Non Repeated value count: " + nonRepeatedCount);
	                           
	                           
	    }

}
*/
