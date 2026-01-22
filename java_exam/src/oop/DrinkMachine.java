package oop;

public class DrinkMachine {
	Drink[] drinks;
	
	public DrinkMachine(Drink bak, Drink mon, Drink hot, Drink mil) {
		this.drinks = new Drink[4];
		this.drinks[0] = bak;
		this.drinks[1] = mon;
		this.drinks[2] = hot;
		this.drinks[3] = mil;
		
	}
	public int orderDrink(int number, int pressCount) {
		if(number >= this.drinks.length || number < 0) {
			System.out.println("상품이 품절되었습니다");
			return 0;
		}
		Drink pressedDrink = this.drinks[number];
		
		if(pressedDrink.stock == 0) {
			System.out.println("품절되었습니다");
			return 0;
		}
		else if(pressedDrink.stock < pressCount) {
			pressedDrink.stock = pressCount;
		}
		pressedDrink.stock -= pressCount;
		return pressedDrink.price*pressCount;
		
		Drink drinks = this.drinks[number];
		System.out.println(drinks.name + "가" + pressCount + "개 나왔습니다.");
		return drinks.price*pressCount;
	}
	public void printAllDrinkInfo() {
		for(int i = 0; i < this.drinks.length; i++)
		System.out.println(this.drinks[i].name + " "+ this.drinks[i].stock + "개 남았습니다.");
	}
}
