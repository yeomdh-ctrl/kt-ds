package exam;

public class Parameter5 {
	public static String getFizzBuzz(int number) {
		if(number % 15 == 0) {
			return("FizzBuzz");
			}
		else if(number % 3 == 0) {
			return ("Fizz");
		}
		else if(number % 5 == 0) {
			return("Buzz");
		}
		return number + "";
	}

	public static void main(String[] args) {
		String result = getFizzBuzz(7);
		System.out.println(result);

	}

}
