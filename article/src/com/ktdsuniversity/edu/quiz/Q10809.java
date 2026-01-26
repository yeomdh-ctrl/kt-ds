package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q10809 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int[] alpha = new int[26];
		
		for(int i = 0; i < 26; i++) {
			alpha[i] = -1;
		}
		for(int i =0; i< s.length(); i++) {
			char ch = s.charAt(i);
			int index = ch - 'a';
			
			if(alpha[index] == -1) {
				alpha[index] = i;
			}
		}
		for(int i = 0; i<26; i++) {
			System.out.println(alpha[i] + "");
		}
		
	}

}
