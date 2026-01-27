package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q11720 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < num; i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum);
		
	}
}	
//	public void case2(String numString) {
//		
//		
//		int length = numString.length();
//		int radix = 1;
//		for(int i = 1; i <= length; i++) {
//			radix *= 10;
//		}
//		
//		long num = Long.parseLong(numString);
//		int divResult = 0;
//		int sum = 0;
//		while(true) {
//			divResult = (int)(num/radix);
//			sum += divResult;
//			
//			num -= (divResult * radix);
//			radix /= 10;
//			if(radix == 0) {
//				break;
//			}
//		}
//		System.out.println(sum);
//	}
//
//}
