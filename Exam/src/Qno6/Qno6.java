package Qno6;

import java.util.Scanner;

public class Qno6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your integer number: ");
		
		int num = input.nextInt();
		
		if ( num % 3 == 0) {
			
		
			System.out.println("MagicArray");
		}
		
		else if ( num % 3 == 1){
			System.out.println("non MajicArray");
		}
			else if ( num % 3 == 2){
				System.out.println("non MajicArray");
			
		}
		else {
			System.out.println("Enter numbers only ");

	}

}
}