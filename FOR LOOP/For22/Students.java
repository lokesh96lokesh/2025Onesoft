package For22;

public class Students {
	String name;
	int age;
	boolean isMale;
	int marks;
	
	public void find (Students[] s) {
		Students max = s[0];
		for(int i=0; i<s.length; i++) {
			if(s[i].age > max.age) {
				max = s[i];}	}
				System.out.println(max.name+"-"+max.age+"-"+max.isMale+"-"+max.marks);
			}
		}
	

