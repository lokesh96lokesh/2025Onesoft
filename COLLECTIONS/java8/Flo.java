package java8;

public class Flo {
	public static void main(String[] args) {
		Employee e = (jan,feb) -> {
			return (float) jan+feb;
		};
		System.out.println(e.salary(12,14));
	}

}
@FunctionalInterface
interface Employee {
	public float salary(int jan,int feb);
}
