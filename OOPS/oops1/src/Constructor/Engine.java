package Constructor;

public class Engine {
private String brand;
private int cc;
public Engine(String brand, int cc) {
	this.brand = brand;
	this.cc = cc;
}
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
public String toString() {
	return brand +" "+cc;
}
}
