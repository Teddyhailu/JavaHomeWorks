package Package;

import java.util.Scanner;

public class HomeWork2No5 {

	public static void main(String[] args) {
		
		
Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		
		int num1 = input.nextInt();
		
		System.out.print("Enter your second number: ");
		
		int num2 = input.nextInt();
		
		int sum = num1+ num2;
		
		int dif = num1 - num2;
		
		System.out.println("Sum: " + sum + "\n" + "Difference: " + dif);
		
		input.close();
		
	}
	
	
}






	