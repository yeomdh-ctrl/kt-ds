package exam;

public class Parameter7 {
	public static String getEvenOdd(int num1, int num2) {
		if(num1 * num2 % 2 == 0) {
			return("짝수");
		}
		else {
			return("홀수");
		}
	}
	public static void main(String[] arg) {
		String result = getEvenOdd(4,5);
		System.out.println(result);
	}

}
