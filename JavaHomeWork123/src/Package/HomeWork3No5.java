package Package;

import java.util.Scanner;

public class HomeWork3No5 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter x: ");

		int num1 = input.nextInt();

		System.out.println("Enter y: ");

		int num2 = input.nextInt();

		int aver = (num1 + num2) / 2;

		System.out.println("The average is: " + aver);

		input.close();

	}

}
