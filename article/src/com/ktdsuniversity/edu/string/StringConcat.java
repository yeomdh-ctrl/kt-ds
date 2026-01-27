package com.ktdsuniversity.edu.string;

public class StringConcat {
	
	public static void main(String[] args) {
		
		String abcd = "asdavbnafgagfasdg";
		
		for(int i = 0; i < 100; i++) {
			abcd += abcd;
		}
		
		System.out.println("완료되었습니다");
	}

}
