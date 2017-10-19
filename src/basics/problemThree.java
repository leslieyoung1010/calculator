package basics;

import java.util.Scanner;

public class problemThree {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		//3) Given 2 int, a and b, return true if one if them is 10 or if their sum is 10.
		//makes10(9, 10) → true
		//makes10(9, 9) → false
		//makes10(1, 9) → true
		int a;
		int b;
		System.out.println("Enter a number 10 or less ");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("Enter a second number 10 or less");
		Scanner in1 = new Scanner(System.in);
		if (a + b == 10) {
				return true;
		}
				else {
			return false;
		}
				
	}
	
}
