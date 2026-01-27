package com.ktdsuniversity.edu.array;

public class Q2562 {

	public static void main(String[] args) {
		int[] numList = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		int max = numList[0];
		int index = 0;
		for(int i = 0; i < numList.length; i++) {
			if(max < numList[i]) {
				max = numList[i];
				index  = i + 1;
			}
		}
		System.out.println(max + " " + index);
	}

}
