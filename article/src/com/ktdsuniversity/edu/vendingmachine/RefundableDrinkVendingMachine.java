package com.ktdsuniversity.edu.vendingmachine;
import com.ktdsuniversity.edu.vendingmachine.item.Drink;
import com.ktdsuniversity.edu.vendingmachine.machine.DrinkVendingMachine;

public class RefundableDrinkVendingMachine extends DrinkVendingMachine{
	
	public RefundableDrinkVendingMachine(Drink drink1, Drink drink2, Drink drink3, Drink drink4) {
		super(drink1, drink2, drink3, drink4);
	}
	public void refund() {
		int remainMoney = super.getInputMoney();
		if(remainMoney > 0) {
			System.out.println(remainMoney + "원 환불되었습니다.");
		}
	}
}
