package exam;

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		
		final int startCount = 5;
		int i = 1;
		int j = 1;
		while(i < 6) {
			j = 1;
			while(j <= startCount - i) {
				System.out.print(" ");
				j++;
			}
			while(j <= startCount) {
				System.out.println("*");
				j++;
			}
		}
		System.out.println(" ");
		
		i++;
		}

	}

