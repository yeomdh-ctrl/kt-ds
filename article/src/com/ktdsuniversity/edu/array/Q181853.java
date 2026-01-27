package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class Q181853 {

	public static void main(String[] args) {
		int[] numList = {12, 4, 15, 46, 38, 1, 14};
		
		Arrays.sort(numList); // ==> 정렬 가장 쉽게 푸는 방법
		
		int[] result = new int[numList.length - 2];
		for(int i = 0; i < 5; i++) {
			result[i] = numList[i];
		}
		System.out.println(Arrays.toString(result));

	}

}
