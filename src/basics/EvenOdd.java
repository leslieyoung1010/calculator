package basics;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		findEvenOdd(num);
		num = 8;
		findEvenOdd(num);

	}
	public static void findEvenOdd (int numb) {
		if(numb % 2 == 0) {
			System.out.println(numb + " is Even");
		}
		else {
			System.out.println(numb + " is Odd");
		}
	}
}
