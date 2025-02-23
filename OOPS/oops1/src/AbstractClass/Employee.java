package AbstractClass;

public abstract class Employee {
	public abstract int empSalary(int amount);   //Unimplemented         //Should type abstract in unimplemented
	public boolean empEducation(boolean isDegreeAvailable) {    //Implemented
		return isDegreeAvailable;
	}

}
