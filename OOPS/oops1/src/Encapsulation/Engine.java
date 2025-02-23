package Encapsulation;

public class Engine {
	private String brand;
	private int cc;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getCc() {
		return cc;
	}
}
