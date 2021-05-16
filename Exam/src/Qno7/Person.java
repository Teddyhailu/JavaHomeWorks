package Qno7;

public class Person {

	private String firstName;
	private String lastName;
	private int pohne;
	
	


	public Person(String firstName, String lastName, int pohne) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.pohne = pohne;
		
		
		
	}




	public Person(double netSalary) {
		// TODO Auto-generated constructor stub
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public int getPohne() {
		return pohne;
		
		
		
		
	}




	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", pohne=" + pohne + "]";
	}




	public void setPohne(int pohne) {
		this.pohne = pohne;
	}
	
}
	
