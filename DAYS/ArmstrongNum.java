package onesoftday1;

public class ArmstrongNum {
	public static void main(String []args) {
		 
        int num = Integer.parseInt(args[0]);
        System.out.println(num);
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
       System.out.println(digits);
        
        for(int i=num;i>0;i/=10){
            int digit = num % 10; 
            sum += Math.pow(digit, digits); 
            num /= 10;
        }
        if(sum==originalNum) {
        	System.out.println(originalNum+" is an amstrong number");
        }
        else {
        	System.out.println(originalNum+" is not an amstrong number");
        }
	}

}
