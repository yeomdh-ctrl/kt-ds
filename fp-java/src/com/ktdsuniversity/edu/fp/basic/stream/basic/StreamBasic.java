package com.ktdsuniversity.edu.fp.basic.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.basic.stream.object.Dish;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishList;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishType;
import com.ktdsuniversity.edu.fp.basic.stream.object.FoodType;

public class StreamBasic {

	public void printDishUseFor() {
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인  && FoodType이 MEAT인 && DishType이 Fish인 - for");
		List<Dish> dishList = DishList.makeDishList();
		for(Dish dish : dishList) {
			if(dish.getCalories() < 500 && dish.getFoodType() == FoodType.MEAT && dish.getDishType() == DishType.FISH) {
			System.out.println(dish);
			}
		}
	}
	public void printDishUseStream() {
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인 && FoodType이 MEAT인 && DishType이 Fish인-List.forEach");
		List<Dish> dishList = DishList.makeDishList();
//		dishList.forEach(dish -> System.out.println(dish));
//		dishList.forEach(System.out :: println);
		dishList.forEach(dish -> {
			if(dish.getCalories() < 500 && dish.getFoodType() == FoodType.MEAT && dish.getDishType() == DishType.FISH) {
				System.out.println(dish);
			}
		});
		
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인 && FoodType이 MEAT인 && DishType이 Fish인- Stream");
		// 스트림을 사용할 수 있는 대상은 List, Set
		dishList // List타입이고 제네릭은 Dish. List<Dish>
				.stream() // Stream<Dish> => List의 Dish가 전달됨
//				.peek(dish -> {
//					System.out.println("첫번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("1." + dish.getName());
//					System.out.println("1." + dish.getCalories());
//					System.out.println("1." + dish.getFoodType());
//					System.out.println("1." + dish.getDishType());
//				}) //Stream<Dish> (현재 반복중인 인스턴스를 확인 - 디버깅 용도)
				.filter(dish -> dish.getCalories() < 500) // 필터를 통과하지 못하면(값이 false라면) 아무것도 나오지 않음, Stream<Dish>가 마찬가지로 전달됨
//				.peek(dish -> {
//					System.out.println("두번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("2." + dish.getName());
//					System.out.println("2." + dish.getCalories());
//					System.out.println("2." + dish.getFoodType());
//					System.out.println("2." + dish.getDishType());
//				})
				.filter(dish -> dish.getFoodType() == FoodType.MEAT) // 필터의 코드가 너무 길면 여러번 나누어서 사용 가능 or은 어쩔수 없이 붙어야함.
//				.peek(dish -> {
//					System.out.println("세번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("3." + dish.getName());
//					System.out.println("3." + dish.getCalories());
//					System.out.println("3." + dish.getFoodType());
//					System.out.println("3." + dish.getDishType());
//				})
				.filter(dish -> dish.getDishType() == DishType.FISH) // Stream<Dish>
//				.peek(dish -> {
//					System.out.println("네번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("4." + dish.getName());
//					System.out.println("4." + dish.getCalories());
//					System.out.println("4." + dish.getFoodType());
//					System.out.println("4." + dish.getDishType());
//				})
				.forEach(dish -> System.out.println(dish));
	}
	public void printEvenNumbers() {
		
		List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 123, 66, 71, 5, 9);
		// 1. numbers 에 있는 값을 전부 2를 곱해서 짝수를 만들어 출력한다.	
		numbers.stream()
		.map(num -> num * 2)
		.forEach(num -> System.out.println(num));
		// 2. numbers 에 있는 값에서 중복된 숫자는 모구 제거하고 나머지 숫자에 전부 2를 곱해서 짝수로 만들어 출력한다.
		System.out.println("=".repeat(40));
		numbers.stream()
		.distinct()
		.map(num -> num*2d)
		.forEach(System.out::println);
	}
	//Collector
	public String makeString() {
		//모든 Vegetables 메뉴의 이름들을 ","로 연결한 문자들을 반환한다
		
		List<Dish> dishList = DishList.makeDishList();
		String dishesName = dishList.stream()//Stream<Dish>
							.filter(dish -> dish.getFoodType() == FoodType.VEGETABLES)
							.map(Dish::getName)
							.collect(Collectors.joining(", "));
		
		return dishesName;
	}
	public List<Dish> getHealthyDishes(){
		// 변경 불가능한 리스트(add불가)
		List<Dish> dishes = DishList.makeDishList();
		List<Dish> result = dishes.stream()
									.filter(dish -> dish.getCalories() < 400)
									.toList(); //collector 기능이 숨겨져 있지만 기능을 하고 있음
		
		return result;
	}
	public List<Dish> getHealthyDishes2(){
		// 변경 가능한 리스트(add가능)
		List<Dish> dishes = DishList.makeDishList();
		List<Dish> result = dishes.stream()
									.filter(dish -> dish.getCalories() < 400)
									.collect(Collectors.toList());
		
		return result;
	}
	
	public static void main(String[] args) {
		StreamBasic basic = new StreamBasic();
		basic.printDishUseFor();
		basic.printDishUseStream();
		basic.printEvenNumbers();
		String dishesName = basic.makeString();
		System.out.println(dishesName);
		
		List<Dish> result = basic.getHealthyDishes();
		System.out.println(result);
//		result.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT)); //에러가남. 수정 불가능한 리스트를 toList로 만들었기 때문
		
		List<Dish> result2 = basic.getHealthyDishes2();
		System.out.println(result2);
		result2.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT));
		System.out.println(result2);
	}
	
}
