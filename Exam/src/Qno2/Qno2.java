package Qno2;

import java.util.Scanner;

public class Qno2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Markes: ");
		
		double Mark = input.nextDouble();
		
		if ( Mark > 100) {
			System.out.println("You must enter leasthan 100");
		}
		
		else if (Mark >=90 && Mark <=100 ) {
			System.out.println("Your Grade is 'A'");
		}
		
		else if (Mark >=80 && Mark <=89 ) {
			System.out.println("Your Grade is 'B'");
		}
		else if (Mark >=70 && Mark <=79 ) {
			System.out.println("Your Grade is 'C'");
		}
		else if (Mark >=50 && Mark <=69 ) {
			System.out.println("Your Grade is 'D'");
		}
		else if (Mark >=0 && Mark <=49 ) {
			System.out.println("Your Grade is 'F'");
		}
		else {
			System.out.println(" you must be greter than 0");
		}
		
	}




		


	}


