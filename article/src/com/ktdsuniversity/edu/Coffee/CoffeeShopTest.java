package com.ktdsuniversity.edu.Coffee;

public class CoffeeShopTest {
	
	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee(Menu.HOT, 4500, 100);
		Coffee iceCoffee = new Coffee(Menu.ICE, 4000, 60);
		
		
//		CoffeeShop starbucks = new CoffeeShop(hotCoffee, iceCoffee); //Coffee라는 생성자를 미리 생성 후 넣어줘야함
		CoffeeShop starbucks = new CoffeeShop();
		
		int price = starbucks.orderCoffee(Menu.HOT, 3);
		System.out.println(price);
		
		price = starbucks.orderCoffee(Menu.ICE, 6);
		System.out.println(price);
		
//		price = starbucks.orderCoffee(3, 5);
//		System.out.println(price);
//		
//		price = starbucks.orderCoffee(0, 10);
//		System.out.println(price);
		
//		hot 을 한개 주문하겠다
//		int price = starbucks.orderCoffee();
//		System.out.println(price);
//		ice 를 한개 주문하겠다
//		price = starbucks.orderCoffee(2);
//		System.out.println(price);
	}

}
