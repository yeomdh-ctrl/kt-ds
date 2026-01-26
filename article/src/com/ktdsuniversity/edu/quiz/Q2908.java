package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		String B = sc.nextLine();
		
		String revA = new StringBuilder(A).reverse().toString();
		String revB = new StringBuilder(B).reverse().toString();
		
		int numA = Integer.parseInt(revA);
		int numB = Integer.parseInt(revB);
		
		System.out.println(Math.max(numA, numB));

	}

}
