package exam;

public class Work1 {

	public static void main(String[] args) {
		boolean isPrime = true;
		for(int num = 2; num <= 100_000; num++) {
			isPrime = true;
			
			for(int i = 2; i*i<=num; i++) {
				if(num % i ==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num);
			}
		}
		}
}
