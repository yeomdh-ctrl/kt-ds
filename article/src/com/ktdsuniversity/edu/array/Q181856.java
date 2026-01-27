package com.ktdsuniversity.edu.array;

public class Q181856 {

	public static void main(String[] args) {
		int[] arr1 = {49 ,13};
		int[] arr2 = {70, 11, 2};
		
		int result;
		if(arr1.length > arr2.length) {
			result = 1;
		}
		else if(arr1.length < arr2.length) {
			result = -1;
		}
		else {
			result = 0;
		}
		System.out.println(result);
	}

}
