package exam;

public class Parameter2 {
	public static void printPrime(int number) {
		boolean isPrime = false;
		for(int i = 2; i < number; i++ ) {
			isPrime = false;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = true;
					break;
				}
			}
			if(!isPrime) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] arg) {
		printPrime(20);
	}

}
