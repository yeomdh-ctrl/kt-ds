package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();		
		String[] words = str.split("\\s+");
		System.out.println(words.length);
	}

}
