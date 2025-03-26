package com.MyWebApp;

public class Shirt {
	private String brand;
	private String color;
	private int price;
	private boolean isChecked;
	private String size;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", color=" + color + ", price=" + price + ", isChecked=" + isChecked
				+ ", size=" + size + "]";
	}
	public int getPrice() {
		return price;
	}
	public Shirt() {
	}
	public Shirt(String brand, String color, int price, boolean isChecked, String size) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.isChecked = isChecked;
		this.size = size;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getisChecked() {
		return isChecked;
	}
	public void setisChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}
