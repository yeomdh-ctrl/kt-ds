package exam;

public class Work1 {

	public static void main(String[] args) {
		int num = 2;
		while(num <= 100000) {
			boolean isPrime = true;
			int i = 2;
			
			while(i*i <=num) {
				if(num % i ==0) {
					isPrime = false;
					break;
				}
				i++;
			}
			if(isPrime) {System.out.println(num);
			}
			num++;
		}
	}
}
