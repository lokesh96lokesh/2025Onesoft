package for2;

public class UseStudents {
public static void main (String[]args) {
	Students s1 = new Students();
	s1.name = "SARO";
	s1.age = 30;
	s1.isMale = true;
	s1.marks = 95;
	
	Students s2 = new Students();
	s2.name = "Ranga";
	s2.age = 25;
	s2.isMale = true;
	s2.marks = 96;
	
	Students s3 = new Students();
	s3.name = "Pradeep";
	s3.age = 24;
	s3.isMale = true;
	s3.marks = 98;
	
	Students s4 = new Students();
	s4.name = "Arivu";
	s4.age = 25;
	s4.isMale = true;
	s4.marks = 80;
	
	Students s5 = new Students();
	s5.name = "Dev";
	s5.age = 16;
	s5.isMale = false;
	s5.marks = 99;
	
	Students[] students = {s1,s2,s3,s4,s5};
	for(Students a : students) {
		if( a.name.length()>3) {
			System.out.println(a.name+"-"+a.age+"-"+a.isMale+"-"+a.marks);
	
	
	//Students min = students[0];
	//Students max = students[0];
	//int count = 0;
	//for( int i=0; i<students.length; i++) {
		//if(students[i].name.length()<max.length) {
		//	max = students[i];
		//if(students[i].age<min.age) {
			//min = students[i];
		//if(students[i].age > max.age) {
			//max = students[i];
		}
	}
	//System.out.println(min.name+" "+min.age+" "+min.isMale+" "+min.marks);
	//System.out.println(max.name+" "+max.age+" "+max.isMale+" "+max.marks);
		//if( students[i].name.length()%2 != 0) {
			//System.out.println(students[i].name);
		//if(students[i].isMale) {
			//count ++;}}
		//System.out.println(count);
		//if(students[i].age >24 && students[i].age<30) {
			//System.out.println(students[i].name);
}
		//System.out.println(students[i].name+"-"+students[i].age+"-"+students[i].isMale+"-"+students[i].marks);
	}


