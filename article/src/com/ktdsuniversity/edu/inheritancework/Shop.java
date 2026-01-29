package com.ktdsuniversity.edu.inheritancework;

public abstract class Shop {
	protected String shopName;
	public Shop(String shopName) {
		this.shopName = shopName;
	}
	public abstract int sell(Customer customer, int price, int moneyReceive);
}
