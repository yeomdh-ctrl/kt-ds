package com.ktdsuniversity.edu.inheritancework;

public class Shop {
	private String product;
	private int price;
	private int wallet;
	private int stock;
	private int quantity;
	int productPrice = price*quantity;
	
	public Shop(String product, int stock, int price, int wallet, int quantity) {
		this.product = product;
		this.price = price;
		this.wallet = wallet;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWallet() {
		return this.wallet;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	public void isEnoughMoney() {
		if(productPrice > wallet) {
			System.out.println("돈이 모자랍니다");
		}
	}	
	public void orderProduct() {
		if(stock < quantity) {
			System.out.println("재고가 모자랍니다");
		}
		else {
			stock -= quantity;
		}
	}
	public void refund() {
		int remainMoney = wallet - price;
		if(remainMoney > 0) {
			System.out.println(remainMoney + "원 환불되었습니다.");
		}
	}
}
