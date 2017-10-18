package basics;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intarray = {7, 12, 19, 22};
		checkArray(intarray); 
		

	}
	public static void checkArray(int [] arr) {
		int location = 0;
		for( int num: arr ) {
			System.out.println(num + " is at that location " + location);
			location ++;
		}
	}

}
