package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.Drink;
public class DrinkVendingMachine {

	Drink[] drinks;
	
	public DrinkVendingMachine( Drink drink1, Drink drink2, Drink drink3, Drink drink4 ) {
		this.drinks = new Drink[4];
		this.drinks[0] = drink1;
		this.drinks[1] = drink2;
		this.drinks[2] = drink3;
		this.drinks[3] = drink4;
	}
	
	public int pressDrinkButton(int drinkNumber, int pressCount) {
		if (drinkNumber < 0 || drinkNumber >= this.drinks.length) {
			return 0;
		}
		
		// 0 1 2 3
		Drink pressedDrink = this.drinks[drinkNumber];
		
		if (pressedDrink.getStock() == 0) {
			System.out.println("품절 되었습니다!");
			return 0;
		}
		else if (pressedDrink.getStock() < pressCount) {
			pressCount = pressedDrink.getStock();
		}
		
		int stock = pressedDrink.getStock();
		stock -= pressCount;
		pressedDrink.setStock(stock);
//		pressedDrink.stock -= pressCount;
		return pressedDrink.getPrice() * pressCount;
	}
	
	public void fillDrink(int drinkNumber, int quantity) {
		if (drinkNumber < 0 || drinkNumber >= this.drinks.length) {
			return;
		}
		
		// 0 1 2 3
		Drink pressedDrink = this.drinks[drinkNumber];
		int stock = pressedDrink.getStock();
		stock += quantity;
		pressedDrink.setStock(stock);
//		pressedDrink.stock += quantity;
	}
	
	public void printAllDrinkInfo() {
		for (int i = 0; i < this.drinks.length; i++) {
			System.out.println(this.drinks[i].name + " " + this.drinks[i].stock + "개 남았습니다.");
		}
	}
	
	
}