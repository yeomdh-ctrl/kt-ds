package exam;

import java.util.Scanner;

public class Q2438 {

	public static void main(String[] args) {
		
		//2~9 구구단 출력
//		int n = 2;
	//	int i = 1;
		
		//while(n<10) {
			//i=1;
			//while(i < 10) {
				//System.out.println(n + "*" + i + "="+ + n*i);
				
			//	i++;
		//	}
		//	n++;
	//	}
		
		int i = 1;
		int j = 1;
		while(i < 6) {
			j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
	}

}
