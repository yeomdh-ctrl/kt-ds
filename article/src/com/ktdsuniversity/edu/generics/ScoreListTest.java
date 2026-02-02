package com.ktdsuniversity.edu.generics;

import java.util.Arrays;

public class ScoreListTest {
	public static void main(String[] args) {
		
		ScoreList<Integer, Integer> list= new ScoreList<>(); // 부등호만 있어도 integer가 전달됨
		list.add(212312); // 0
		list.add(234543); // 1
		list.add(234543); // 2(인덱스 번호)
		list.add(234543); //3
		list.add(234543); //4
		list.add(234543); //5
		
//		int sum = 0;
//		for(int i = 0; i < 6; i++) {
//			sum += list.get(i);
//		}
//		System.out.println(sum);
		
		Reducer<Integer, Integer> listReducer = new Reducer<>() {
			@Override
			public Integer reduce(Integer input, Integer output) {
				
				return input + output;
			}};
			
			int sum = list.sum(listReducer, 0);
			System.out.println(sum);
			
		int value = list.get(2);
		System.err.println(value);
		
		
		ScoreList<String, String> strlist = new ScoreList<>();
		strlist.add("adsgga");
		strlist.add("qwer");
		
		String concat = "";
		for(int i = 0; i < 2; i++) {
			concat += strlist.get(i);
		}
		System.out.println(concat);
		
		String strValue = strlist.get(1);
		System.out.println(strValue);
		
		
		ScoreList<String[], String> arraylist = new ScoreList<>();
		arraylist.add(new String[] {"asdad", "asdaff"});
		arraylist.add(new String[] {"asdad", "asdaff"});
		
		String arrayConcat = "";
		for(int i = 0; i < 2; i++) {
			arrayConcat += Arrays.toString(arraylist.get(i));
		}
		System.out.println(arrayConcat);
		
		
		Reducer<String[], String> arrayReducer = new Reducer<>() {

			@Override
			public String reduce(String[] input, String output) {
				for(int i = 0; i < input.length; i ++ ) {
					output += input[i];
				}
				return output;
			}};
			String[] arrayValue = arraylist.get(1);
			System.out.println(Arrays.toString(arrayValue));
	}

}
