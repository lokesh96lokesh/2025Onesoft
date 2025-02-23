package Map;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private int exp;
	private boolean isMale;
	private String role;
	
	public Employee(String name, int age, int salary, int exp, boolean isMale, String role) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.exp = exp;
		this.isMale = isMale;
		this.role = role;
	}
	
	
	
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", salary=" + salary + ", exp=" + exp + ", isMale=" + isMale
				+ ", role=" + role ;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
