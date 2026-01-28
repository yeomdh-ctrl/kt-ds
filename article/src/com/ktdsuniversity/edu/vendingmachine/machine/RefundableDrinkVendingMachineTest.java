package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.RefundableDrinkVendingMachine;
import com.ktdsuniversity.edu.vendingmachine.item.Drink;


public class RefundableDrinkVendingMachineTest {

	public static void main(String[] args) {
		
		Drink 박카스 = new Drink("박카스", 900, 15);
		Drink 몬스터 = new Drink("몬스터", 1500, 20);
		Drink 핫식스 = new Drink("핫식스", 1300, 10);
		Drink 밀키스 = new Drink("밀키스", 1400, 5);
		DrinkVendingMachine machine = new RefundableDrinkVendingMachine(박카스, 몬스터, 핫식스, 밀키스);
		
		int orderMoney = machine.pressDrinkButton(1, 3, 10000);
		System.out.println("주문금액: " + orderMoney);
		
		if (machine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		
		orderMoney = machine.pressDrinkButton(2, 3, 10000);
		System.out.println("주문금액: " + orderMoney);
		
		if (machine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		
	}
	
}
