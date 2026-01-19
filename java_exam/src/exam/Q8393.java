package exam;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = 3;
		int sum = 1;
		while(n>1) {
			sum += n;
			n--;
		}
		{
			System.out.println(sum);
		}

	}

}
