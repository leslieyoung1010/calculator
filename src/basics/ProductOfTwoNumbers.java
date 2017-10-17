package basics;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	
		int  a, b, c;
	
		System.out.println("Enter two numbers to calculate the difference of two numbers  ");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = a - b;
		System.out.println("The difference between two numbers is " + c);
	}

}
