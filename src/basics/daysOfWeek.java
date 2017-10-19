package basics;
import java.util.Scanner; 

public class daysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number for the day of the week  ");
		int num1 = input.nextInt();
		System.out.println("The day of the week is  " +  dayOfWeek(num1));
		
	}
	public static String dayOfWeek(int daynum) {
		switch (daynum) {
		case 1 : 
			return "Monday";
		case 2 : 
			return "Tuesday";
		case 3 : 
			return "Wednesday";
		case 4 : 
			return "Thursday";
		case 5 : 
			return "Friday";
		case 6 : 
			return "Saturday";
		case 7 : 
			return "Sunday";
		default  : 
			return "Undefined";
			
			
					
		}
	}

}
