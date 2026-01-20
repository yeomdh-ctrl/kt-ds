package exam;

public class Parameter6 {
	public static int getUniqueNumbers(int numbers1) {
		int[] numbers = new int[7];
		numbers1 = (int)(Math.random()*45+1);
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*45+1);			
			for(int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		return numbers1;
	}

	public static void main(String[] args) {
		int result = getUniqueNumbers(7);
		System.out.println(result);

	}

}
