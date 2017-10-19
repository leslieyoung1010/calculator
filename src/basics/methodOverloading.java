package basics;

public class methodOverloading {
	public class MathUtils {
			
			public int sum(int num1, int num2) {
				return num1+num2;
			}
			
			//valid overloaded method same name but different 
			//"types" and number of parameters
			public double sum(double num1, double num2) {
				return num1+num2;
			}
			
			//valid overloaded method same name but different number of parameters
			public int sum(int num1, int num2, int num3) {
				return num1 + num3 + num2;
			}
			
			public int multiply(int num1, int num2, int num3) {
				return num1 * num2 * num3;
			}
			public int divide(int num1, int num2, int num3) {
				return num1 / num2 / num3;
			}
			
			public int subtract(int num1, int num2, int num3) {
				return num1 - num2 - num3;
			}
			
			public double multiply(double num1, double num2, double num3) {
				return num1 * num2 * num3;
			}
			public double subtract(double num1, double num2, double num3) {
				return num1 - num2 - num3;
			}
			public double sum(double num1, double num2, double num3) {
				return num1 + num2 + num3;
			}
			public int multiply(int num1, int num2)  {
				return num1 * num2;
			}
			public int subtract(int num1, int num2) {
				return num1 - num2;
			}
				
			}
			
			
			
		
	}

