package com.ktdsuniversity.edu.inheritancework;

public class Shop {
	private String shopName;
	public Shop(String shopName) {
		this.shopName = shopName;
	}
	public void sell(Customer customer,int productPrice, int payMoney) {
		int change = payMoney - productPrice;
		customer.setWallet(change + customer.getWallet()); 
		System.out.println("거스름돈:" + change);
	}
}
