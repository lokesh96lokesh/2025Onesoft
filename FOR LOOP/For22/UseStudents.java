package For22;

public class UseStudents {
	public static void main (String[]args) {
		Students s1 = new Students();
		s1.name = "Saravanan";
		s1.age = 30;
		s1.isMale = true;
		s1.marks = 451;
		
		Students s2 = new Students();
		s2.name = "Ranga";
		s2.age = 24;
		s2.isMale = true;
		s2.marks = 472;
		
		Students s3 = new Students();
		s3.name = "Pradeep";
		s3.age = 22;
		s3.isMale = true;
		s3.marks = 480;
		
		Students s4 = new Students();
		s4.name = "selvi";
		s4.age = 21;
		s4.isMale = false;
		s4.marks = 490;
		
		Students s5 = new Students();
		s5.name = "kamala";
		s5.age = 20;
		s5.isMale = false;
		s5.marks = 495;
		
		Students[] s = {s1,s2,s3,s4,s5};
		s4.find(s);		
	}

}
