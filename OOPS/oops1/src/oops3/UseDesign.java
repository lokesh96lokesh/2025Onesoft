package oops3;

public class UseDesign {
	public static void main(String[] args) {
	Design d = new Design();
	System.out.println(d.getPack("Jave")+" "+d.getVers("J.123")+" "+d.getYear(2000)+" "+
	d.getValue(250000)+" "+d.getSoft("Windows"));
	}
}
interface Package {
	public String getPack(String name);
	public String getVers(String version);
	public int getYear(int year);
}

class Model implements Package {
	public String getPack(String name) {
		return name;
	}
	public String getVers(String version) {
		return version;
	}
	public int getYear(int year) {
		return year;
	}
	public int getValue(int value) {
		return value;
	}
}

class Design extends Model {
	public String getSoft(String software) {
		return software;
	}
}