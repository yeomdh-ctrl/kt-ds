package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q181842 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		if(str1.contains(str2)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
	}
}
