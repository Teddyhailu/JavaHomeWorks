package Qno7;



public class Main {

	public static void main(String[] args) {
		
	
		Student stu = new Student();
		stu.setFirstName("Hagos");
		stu.setLastName("Solomon");
		stu.phone(2025697675);
		stu.gap(3.8);
		
		Instructor ins = new Instructor();
		ins.setFirstName("Berhane");
		ins.setLastName("Salih");
		ins.ponhe(5712565365);
		ins.netSalary(80,000);
	}
	
	
	
	public void Student() {
		System.out.println("firstName: " + firstName);
		System.out.println("LastName: " + lastName );
		System.out.println("phone number :" + phone);
		System.out.println("GPA:" + gpa);
	}

	public void Instructor() {
		System.out.println("firstName: " + firstName);
		System.out.println("LastName: " + lastName );
		System.out.println("phone number :" + phone);
		System.out.println("Net Salary :" + netSalary);
	}

}
