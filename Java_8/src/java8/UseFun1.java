package java8;

public class UseFun1 {
	public int getSum(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Fun1 f1 = (a,b) -> a+b;
		System.out.println(f1.getSum(10,20));
		System.out.println(f1.getWeight());

		UseFun1 uf = new UseFun1();
		Fun1 f2 = uf :: getSum;
		System.out.println(Fun1.getName("loki")+" "+f2.getSum(12,15));
		//System.out.println(Fun1.getName()+" "+f2.getSum(12,15));
			
	}
}

@FunctionalInterface
interface Fun1 {
	public int getSum(int a,int b);
	
	public static String getName(String name) {
		return name;
	}
	/*public static String getName() {
		return "sara";
	}*/
	public default float getWeight() {
		return 63.3f;
	}
}
