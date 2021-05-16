package Qno4;

import java.util.Scanner;

public class Qno4 {

	public static void main(String[] args) {

		Scanner Str = new Scanner (System.in);
		System.out.println(" Enter String to count the vowels:");
		String input = Str.nextLine();
		int vowelcount = 0;
		
		for (int i =0; i <input.length(); i++)  {
			char ch = input.charAt(i);
			
			switch(ch) {
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
				vowelcount++;
				break;
				default:
					break;
			}
			}
		
		System.out.println("You Have " + vowelcount + "  Vowel/s");

	}

}
