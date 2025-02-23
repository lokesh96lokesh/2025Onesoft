package onesoftday1;

public class PrimeSeries {
	public static void main(String[] args) {
        int num = 2; 
        int limit = 20; 

        System.out.println("Prime numbers up to " + limit + ":");

        while (num <= limit) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++; 
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) {
                return false; 
            }
            i++;
        }
        return true;
    }

}
