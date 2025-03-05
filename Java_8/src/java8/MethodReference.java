package java8;

public class MethodReference {
	public String nonVegFood(String foodStatus) {
		return foodStatus;
	}
	public static void main(String[] args) {
		MethodReference m = new MethodReference();
		Hotel foodStatus = m :: nonVegFood;
		String r = foodStatus.vegFood("Available");
		
		System.out.println(r);
	}

}
interface Hotel {
	public String vegFood(String foodStatus);
}