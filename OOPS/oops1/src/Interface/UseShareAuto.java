package Interface;

public class UseShareAuto {
	public static void main(String[] args) {
		ShareAuto sa=new ShareAuto();
		System.out.println("Seating Capacity: "+sa.seatCapacity(4));
		System.out.println("Is LPG: "+sa.isLpg(true));
		sa.noOfWheels(3);
		sa.mileage(25);
	}

}
