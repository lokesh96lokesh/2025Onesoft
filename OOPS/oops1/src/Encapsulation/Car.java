package Encapsulation;

public class Car {
	private String brand;
	private int price;
	private boolean isPetrol;
	private Engine engine;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setIsPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}
	public boolean getIsPetrol() {
		return isPetrol;
	}
	public void setEngin(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngin() {
		return engine;
	}

}
