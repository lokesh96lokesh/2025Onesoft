package oops3;

public class UseSuzki {
	public static void main(String[] args) {	
		Suzuki s = new Suzuki();
		System.out.println(s.getSpeed(1500)+" "+s.getRate(500000)+" "+s.getName("XUV")+" "+s.getTyre("MRF"));
	}

}
interface SportsBike {
	public int getSpeed(int speed);
	public int getRate(int rate);
}

interface RaceBike {
	public String getName(String name);
	public String getTyre(String tyre);
}

class Suzuki implements SportsBike,RaceBike {
	public int getSpeed(int speed) {
		return speed;
	}
	public int getRate(int rate) { 
		return rate;
	}
	public String getName(String name) {
		return name;
	}
	public String getTyre(String tyre) {
		return tyre;
	}
}


