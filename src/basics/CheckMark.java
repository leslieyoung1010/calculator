package basics;

public class CheckMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gradeStudent(100);

	}

	public static void gradeStudent(int score) {
		if (score >= 70 && score < 80) {
			System.out.println("grade C");
		}

		else if (score <= 60 && score < 70) {
			System.out.println("grade D");
		}

		else if (score < 60) {
			System.out.println("grade F");
		}

		else if (score >= 80 && score < 90) {
			System.out.println("grade B");
		} else if (score >= 90) {
			System.out.println("grade A");

		}

	}

}