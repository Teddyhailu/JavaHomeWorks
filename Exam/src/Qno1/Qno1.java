package Qno1;

public class Qno1 {

	public static void main(String[] args) {
		
		
		String FirstName = "Tedros John" ;
		String City = "Washington";
		String State = "DC";
		double GrossSalary = 100000.00;
		double Tax = 100000.00 * .2;
		double NetSalary = (GrossSalary - Tax);
		
	
		System.out.println("Hello My Name is : " + FirstName + "  I live in : " + City +" " + State);
		System.out.println ("My gross salary is :$" + GrossSalary + " I pay: $ " + Tax + " in tax and i take home:$ " + NetSalary  ); 
		

	}

}
