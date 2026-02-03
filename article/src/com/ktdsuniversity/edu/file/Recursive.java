package com.ktdsuniversity.edu.file;

public class Recursive {
	
	public void printNumber(int number) {
		System.out.println(number);
		if(number > 0) {
			printNumber(number - 1);			
		}
	}
	
//	public void print(int number) {
//		System.out.println("출력합니다. " + number);
//		if(number < 3) {
//		print(number + 1);
//		System.out.println((number) + "스택 실행을 완료했습니다");
//		}
//	}

	public static void main(String[] args) {
		Recursive r = new Recursive();
//		r.print(1);
		r.printNumber(2000); // 결과 ==> 2000~0
	}

}
