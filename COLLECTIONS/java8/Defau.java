package java8;

public class Defau {
	public static void main(String[] args) {
		Stad1 s = new Stad1();
		System.out.println(Stad5.getName()+"\n"+s.getAge()+"\n"+s.getWeight());
	}

}
interface Stad5  {
	public static String getName() {
		return "Dara";
	}
	public default int getAge() {
		return 26;
	}
	public default float getWeight() {
		return 58.4f;
	}
}
class Stad1 implements Stad5 {
//	public int getAge() {
//		return 35;
//	}
	public float getWeight() {
		return 65;
	}
}
