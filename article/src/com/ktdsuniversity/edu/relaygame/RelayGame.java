package com.ktdsuniversity.edu.relaygame;

import java.util.Scanner;

public class RelayGame {
	
	private Scanner keyboard;
	private String startWord;
	private String nextWord;
	
	public RelayGame() {
		this.keyboard = new Scanner(System.in);
	
	}
	public void startGame() {
		System.out.println("게임이 시작되었습니다");
		System.out.println("시작 단어를 입력해주세요");
		this.startWord = this.keyboard.nextLine();
		
		
		while(true) {
			System.out.println("다음 단어를 입력해주세요");
			this.nextWord = this.keyboard.nextLine();
			this.nextWord = this.nextWord.trim();
			
			//괄호 안에 숫자는 배열을 생각하면 됨. ex) 기찻길 = 0,1,2
			//마지막 글자: "기찻길옆오막살이".length() ==> 8 - 1 ==> 7
			//첫번째 글자: "기찻길옆오막살이"
			String lastLetter = this.startWord.charAt(this.startWord.length() - 1) + "";
			String firstLetter = this.nextWord.substring(0, 1); //0번부터 시작해서 1번전까지 가지고와라
			
			if(lastLetter.equals(firstLetter)) {
				
				if(this.nextWord.length() >= 3) {
					this.startWord = this.nextWord;
				}
				else {
					System.out.println("게임이 종료되었습니다");
					break;
				}
			}
			else {
				System.out.println("게임이 종료되었습니다");
				break;
			}
		}		
	}	
	public static void main(String[] args) {
		RelayGame game = new RelayGame();
		game.startGame();
	}
}
