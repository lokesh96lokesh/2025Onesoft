package Interface;

public class ShareAuto implements Auto, Vehicle {
	public int seatCapacity(int seatCapacity) {
		return seatCapacity;
	}
	public boolean isLpg(boolean isLpg) {
		return isLpg;
	}
	public void noOfWheels(int noOfWheel) {
		System.out.println("No of Wheels: "+noOfWheel);
	}
	public void mileage(int mileage) {
		System.out.println("Mileage: "+mileage);
	}

}
