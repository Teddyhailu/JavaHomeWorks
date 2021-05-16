package Qno7;

public class Student extends Person {

	
	private double gpa;

	public Student(double gpa) {
		super(gpa);
		this.gpa = gpa;
	
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + "]";
	}
	
}
