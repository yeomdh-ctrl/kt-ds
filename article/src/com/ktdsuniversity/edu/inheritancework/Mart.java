package com.ktdsuniversity.edu.inheritancework;

public class Mart extends Shop{
	public Mart() {
		super("슈퍼마트");
	}

	@Override
	public int sell(Customer customer, int price, int moneyReceive) {
		if(price > moneyReceive) {
			System.out.println(shopName + " " + "돈이 부족합니다");
			return moneyReceive;
		}
		int change = moneyReceive - price;
		customer.setMoney(customer.getMoney());
		System.out.println(shopName +" " + "거스름돈: " + change);
		return 0;
	}

}
