package Oops2;

public class UseSoftware {
	public static void main(String[]args) {
		Data d = new Data(true,false,"Saro",29,123);
		System.out.println(d);
		
	}

}
class Data extends Employee1 {
	private String name;
	private int age;
	private int id;
	
	public void setname(String name) {
		this.name=name;}
	public String getname() {
		return name;}
	public void setage(int age) {
		this.age=age;}
	public int getage() {
		return age;}
	public void setid(int id) {
		this.id=id;}
	public int getid() {
		return id;}
	public Data(boolean isBike,boolean isHigh,String name,int age,int id) {
		super(isBike,isHigh);
		this.name = name;
		this.age = age;
		this.id = id; }
	public String toString() {
		return super.toString() +",Name: "+name+", Age: "+age+", Id: "+age;
	}
}
class Employee1 {
	private boolean isBike;
	private boolean isHigh;
	
	public Employee1(boolean isBike,boolean isHigh) {
		this.isBike = isBike;
		this.isHigh = isHigh;
	}
}
