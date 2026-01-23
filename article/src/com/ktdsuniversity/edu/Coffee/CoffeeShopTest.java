package com.ktdsuniversity.edu.Coffee;

public class CoffeeShopTest {
	
	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노(Hot)", 4500, 100);
		Coffee iceCoffee = new Coffee("아이스티", 4000, 60);
		
		
		CoffeeShop starbucks = new CoffeeShop(hotCoffee, iceCoffee); //Coffee라는 생성자를 미리 생성 후 넣어줘야함
		
		int price = starbucks.orderCoffee(1, 3);
		System.out.println(price);
		
		price = starbucks.orderCoffee(2, 6);
		System.out.println(price);
		
		price = starbucks.orderCoffee(3, 5);
		System.out.println(price);
		
		price = starbucks.orderCoffee(0, 10);
		System.out.println(price);
		
	}

}
