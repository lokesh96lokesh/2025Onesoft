package onesoftday1;

public class Student {
	
	public static void main(String[] args) {
		
	    String str = "programming";
        System.out.println("Repeated characters:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) { 
                    System.out.println(str.charAt(i));
                    break;
                }
            }
		/*int a=5;
		String a="java";
		for (int i=1;i<=a.length();i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(i);
			}
		}*/
		
		/*int [] nums= {23,45,23,76,46};
		int max=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}System.out.println(max);
		
		for(int i=0;i<nums.length;i++) {
			if(i%2==0) {
				System.out.println(nums[i]+" is even");
			}
			else {
				System.out.println(nums[i]+" is odd");
			}
		}*/

		
		/*String name="loki";
		int age= 29;
		boolean ismale=true;
		float percent=98.5f;
		int total=0;
		int count=0;
		
		for (int i=1;i<=10;i++) {
			if(i%2==0) {
				total=total+i;
				count=count+1;
			
		
			System.out.println(total/count);
			}
		}
				System.out.println(age+"is even");
				break;
				continue;
				}
			else {
				System.out.println(age+"is odd");
				break;
			}
	}*/
}
}
}
