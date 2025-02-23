package OOPS2_Inheritance;

public class SchoolStudent extends Student {             //Child class
	private int mark;
	private int rank;
	
	public void setMark(int mark) {
		this.mark=mark;
	}
	public int getMark() {
		return mark;
	}
	public void setRank(int rank) {
		this.rank=rank;
	}
	public int getRank() {
		return rank;
	}
	public SchoolStudent(String name,int age,boolean isMale,int mark,int rank) {
		super(name,age,isMale);
		this.mark=mark;
		this.rank=rank;
	}
	public String toString() {
		return super.getName()+" "+super.getAge()+" "+super.getIsMale()+" "+mark+" "+rank;
	}
	

}
