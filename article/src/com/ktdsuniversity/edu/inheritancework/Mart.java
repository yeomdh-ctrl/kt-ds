package com.ktdsuniversity.edu.inheritancework;

public class Mart extends Shop{
	public Mart() {
		super("슈퍼마트");
	}

	@Override
	public int sell(Customer customer, int price, int payMoney) {
		if(price > payMoney) {
			System.out.println(shopName + " " + "돈이 부족합니다");
			return payMoney;
		}
		int change = payMoney - price;
		customer.setMoney(customer.getMoney());
		System.out.println(shopName +" " + "거스름돈: " + change);
		return 0;
	}

}
