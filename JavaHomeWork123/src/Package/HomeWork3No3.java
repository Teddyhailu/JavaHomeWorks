package Package;

import java.util.Scanner;

public class HomeWork3No3 {

	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);	
		System.out.println("Enter number 1 to 7"); 
		int i=0;
		int n=3;
	int day=n;
	switch (day) {
	case 1:
	System.out.println("You entered 1 for Monday");
	System.out.println("Monday is a weekday");
	break; 
	case 2:
	System.out.println("You entered 2 for Tuesday");
	System.out.println("Tuesday is a weekday");
	break; 
	case 3:
	System.out.println("You entered 3 for Wednesday");
	System.out.println("Wednesday is a weekday");
	break; 
	case 4:
	System.out.println("You entered 4 for Thursday ");
	System.out.println("Thursday is a weekday");
	break; 
	case 5:
	System.out.println("You entered 5 for Friday");
	System.out.println("Friday is a weekday");
	break; 
	case 6:
	System.out.println("You entered 6 for Saturday");
	System.out.println("Saturday is a weekend");
	break; 
	case 7:
	System.out.println("You entered 7 for Sunday");
	System.out.println("Sunday is a weekend");
	break; 
	}
		
	}

}
