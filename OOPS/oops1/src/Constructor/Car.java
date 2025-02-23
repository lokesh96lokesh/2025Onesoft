package Constructor;

public class Car {
	private String brand;
	private int price;
	private String colour;
	private Engine engine;
public Car(String brand,int price,String colour,Engine engine) {
	this.brand = brand;
	this.price = price;
	this.colour = colour;
	this.engine = engine;
}
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
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
	public String toString() {
		return brand+" "+price+" "+colour+" "+engine;
	}
}
