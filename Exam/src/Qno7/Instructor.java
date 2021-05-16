package Qno7;

public class Instructor extends Person {

	private double grossSalary;
	
	public double calculateSalary;
	double netSalary = grossSalary*.2;
	
	
		
	public Instructor(double netSalary) {
		super(netSalary);
		this.netSalary = netSalary;
	}

	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "Instructor [netSalary=" + netSalary + "]";
	}
	
}
