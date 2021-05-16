
public class HomeWorkQ1 {

	public static void main (String [] args) {
	//Average value of Array
	 int [] Array = { 5,10,15,20,25,30 };
	 int sum = 0;
	 double average = 0.00;
	 int i;
	 for (i=0; i<Array.length; i++) {
	 sum = sum + Array[i];
	 }
	 System.out.println("Total: " + sum);
	 average = sum/Array.length;
	 System.out.println("Average: " + average);
 
	}
	}

