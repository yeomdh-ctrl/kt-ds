package oop;

public class DrinkMachineTest {

	public static void main(String[] args) {
		Drink bakas = new Drink("박카스",900,15);
		Drink monster = new Drink("몬스터",1500,20);
		Drink hot6 = new Drink("핫식스",1300,10);
		Drink milkiss = new Drink("밀키스",1400,5);
		
		DrinkMachine vendingMachine = new DrinkMachine(bakas, monster, hot6, milkiss);
		vendingMachine.printAllDrinkInfo();
		int price = vendingMachine.orderDrink(2, 5);
		System.out.println(price);
		
		
	}

}
