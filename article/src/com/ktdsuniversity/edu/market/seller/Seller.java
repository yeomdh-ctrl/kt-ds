package com.ktdsuniversity.edu.market.seller;

public class Seller {
	private final int price = 1000;
    private final int itemWeight = 500;
	private int money;
	private int stock;
	private int sellCount;
	
	 
	
	public Seller(int money, int stock, int sellCount) {
		this.money = money;
		this.stock = stock;
		this.sellCount = sellCount;
	}
	public int getMoney() {
		return this.money;
	}
	public int getStock() {
		return this.stock;
	}
	public int getSellCount() {
		return this.sellCount;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}
	public int sellCount(int count) {
		if(this.stock == 0) {
			System.out.println("품절되었습니다");
			return 0;
		}
		else if(count > this.stock) {
			this.sellCount = this.stock; //판매자가 소지한 상품의 개수보다 더 많은 개수의 상품을 판매하려 할 경우, 남은 모든 재고를 판매
		}
		else {
			this.sellCount = count;
		}
		this.stock -= this.sellCount;
		this.money += this.sellCount * this.price;
		return this.sellCount;
	}
	public void showResult() {
		System.out.println("재고 수: " + this.stock);
		System.out.println("자본금: " + this.money);
	}
}
