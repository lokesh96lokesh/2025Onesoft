package Conditions;

public class elsetime {
	public static void main (String[] args) {
	int time = 14;
	if (time>4 && time<12) {
		System.out.println("Good Morning");
	}
	else if (time>=12 && time<14) {
		System.out.println("Good Afternoon");
	}
	else if (time>=14 && time<18) {
		System.out.println("Good Evening");
	}
	else {
		System.out.println("Good ninght");
	}
	}

}
