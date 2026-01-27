package com.ktdsuniversity.edu.array;

public class Q10818 {

	public static void main(String[] args) {
		int[] numList = {20, 10, 35, 30, 7};
		int max = numList[0];
		int min = numList[0];
		
		for(int i = 0; i < numList.length; i++) {
			if(numList[i] < min) {
				min = numList[i];
			}
			if(numList[i] > max) {
				max = numList[i];
			}
			}
		System.out.println(max + " " + min);
	}

}
