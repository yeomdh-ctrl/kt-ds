package exam;

public class Parameter3 {
	public static void printMax(int number1, int number2) {
		
		if(number1 > number2) {
			System.out.println(number1);
		}
		else {
			System.out.println(number2);
		}
	}

	public static void main(String[] args) {
		printMax(10, 20);

	}

}
