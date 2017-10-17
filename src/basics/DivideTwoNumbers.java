package basics;
import java.util.Scanner;
public class DivideTwoNumbers {

	public static void main(String[] args) {
	
		int  a, b, c;
	
		System.out.println("Enter two numbers to divide  ");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = a / b;
		System.out.println("The division of two numbers is " + c);
	}

}
