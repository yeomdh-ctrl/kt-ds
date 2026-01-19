package java_exam;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		
		//Scanner keyboard = new Scanner(System.in);
		
		//int inputNumber = 101; // 사용자가 입력하는 숫자가 여기에 들어온다.
		// 사용자가 입력하는 값이 100이하일 동안만 {...}을 실행해라.
		//while(inputNumber <= 100) {
			
		//사용자로붜 정수를 입력받는다.
			//inputNumber = keyboard.nextInt();
			//System.out.println(inputNumber);
		//}
		//System.out.println("어플리케이션을 종료합니다.");
		
		Scanner keyboard = new Scanner(System.in);
		double randomNumber = Math.random();
		int answer = (int)(randomNumber * 100);
		int value = 0;
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			value = keyboard.nextInt();
			if (answer == value) {
				System.out.println("정답입니다!");
				break; // 정답일 경우 무한 반복 종료
			}
			else if (answer > value) {
				System.out.println("Up!");
			}
			else {
			System.out.println("Down!");
			}
	
		}	
	}

}
