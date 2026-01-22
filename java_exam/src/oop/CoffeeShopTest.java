package oop;

public class CoffeeShopTest {
	
	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노(Hot)", 4500);
		Coffee iceCoffee = new Coffee("아이스티", 4000);
		Coffee tea = new Coffee("캐모마일 티", 5000);
		
		CoffeeShopArray starbucks = new CoffeeShopArray(hotCoffee, iceCoffee, tea); //Coffee라는 생성자를 미리 생성 후 넣어줘야함
		
		int price = starbucks.orederCoffee(1, 3);
		System.out.println(price);
		
		price = starbucks.orederCoffee(2, 6);
		System.out.println(price);
		
		price = starbucks.orederCoffee(3, 5);
		System.out.println(price);
		
		price = starbucks.orederCoffee(0, 10);
		System.out.println(price);
		
	}

}
