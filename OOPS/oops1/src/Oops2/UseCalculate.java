package Oops2;

public class UseCalculate {
	public static void main(String[] args) {
		CalculateThree c = new CalculateThree();
		System.out.println(c.operation(50,50));
	}

}

class CalculateThree extends CalculateTwo {
	public int operation(int number1,int number2) {
		int number = number1 * number2;
		return number;
	}
}


class CalculateTwo extends CalculateOne {
	public int operation(int number1,int number2) {
		int number = number1 - number2;
		return number;
	}
}

class CalculateOne {
	int number1;
	int number2;
	public int operation(int number1,int number2) {
		int number = number1 + number2;
	return number;
	}
}
