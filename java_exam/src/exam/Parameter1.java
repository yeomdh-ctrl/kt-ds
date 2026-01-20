package exam;

public class Parameter1 {
	public static void printSum(int number) {
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] arg) {
		printSum(10);
	}

}
