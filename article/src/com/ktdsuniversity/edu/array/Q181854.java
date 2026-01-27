package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class Q181854 {

	public static void main(String[] args) {
		int arr[] = {444, 555, 666, 777};
		int n = 100;
		for(int i = 0; i < arr.length; i++) {
			if(arr.length % 2 == 0 && i % 2 == 1) {
				arr[i] += n;
			}
			else if(arr.length % 2==1 && i % 2 == 0) {
				arr[i] += n;
			}
		
		}
		System.out.println(Arrays.toString(arr));
	}
}
