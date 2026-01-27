package com.ktdsuniversity.edu.array;

public class Q5597 {

	public static void main(String[] args) {
		int[] nums = {3, 1, 4,5,7,9,6,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		
		int temp = 0;
		for(int i =0; i< nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		int[] miss = new int[nums.length];
		int missIndex = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1] - 1) {
				miss[missIndex++] = nums[i] + 1;
			}
		}
		
		System.out.println(miss[0]);
		System.out.println(miss[1]);
		
	}
}
