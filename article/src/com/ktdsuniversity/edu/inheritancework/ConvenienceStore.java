package com.ktdsuniversity.edu.inheritancework;

public class ConvenienceStore extends Shop{
	public ConvenienceStore() {
		super("편의점");
	}

	@Override
	public int sell(Customer customer, int price, int moneyReceive) {
		
		if(customer.getPoint() >= 100) {
			customer.setPoint(0);
		}
		int pay = price + customer.getPoint();
		if(price > moneyReceive + customer.getPoint()) {
			System.out.println(shopName + " " + "돈이 부족합니다");
			return moneyReceive;
		}
		int change = moneyReceive + customer.getPoint() - price;
		customer.setMoney(customer.getMoney());
		System.out.println(shopName +" " + "거스름돈: " + change);
		return 0;
		
	}
}
