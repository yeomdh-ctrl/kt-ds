package com.ktdsuniversity.edu.exceptions;

public class RandomExtractNumbers {
	private String[] numbers;
	
	public RandomExtractNumbers() {
		this.numbers = new String[100];
		
		int index = 0;
		for(int i = 0; i < 10; i++) {
			// 0~99중 하나
			index =(int)(Math.random() * this.numbers.length);
			this.numbers[index] =(int)(Math.random() * 1_000_000) + "";
		}
		for(int i = 0; i < 10; i++) {
			// 0~99중 하나
			index = (int)(Math.random() * this.numbers.length);
			this.numbers[index] = (char)((int)(Math.random() * 26) + 97) + "";
		}
	}
	
	public void printNumber(int index) {
		if(index < 0 || index >= this.numbers.length) {
			System.out.println(index +""+ 0);
			return;
		}
		String value = this.numbers[index];
		if(value == null) {
			System.out.println("Index: " + index + "-Null.Result" + 0);
			return;
		}
		if(value.matches("^[0-9]+$")) {
			int intvalue = Integer.parseInt(value);
			System.out.println(intvalue);
		}
		else {
			System.out.println(index + " - " + value + "wrong" + 0);
		}
		int intvalue = Integer.parseInt(value);
		System.out.println(intvalue);
		
//		String str = this.numbers[index];
//		if(str == null) {
//			System.out.println(0);
//			return;
//		}
//		if(index > this.numbers.length) {
//			if(this.numbers != null && index >= 0 && index < this.numbers.length) {
//				System.out.println(this.numbers[index]);
//			}
//		}
		//this.numbers 의 index에 존재하는 값을 출력한다.
		//값이 숫자인 경우 그대로 출력하고
		//숫자가 아닌경우 0을 출력한다.
		
		
		
		
	}
	
	public static void main(String[] args) {
		RandomExtractNumbers ren = new RandomExtractNumbers();
		int index = 0;
		for(int i = 0; i < 50; i++) {
			index = (int)(Math.random()*200);
			ren.printNumber(index);
		}
	}

}
