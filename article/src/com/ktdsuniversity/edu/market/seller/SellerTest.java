package com.ktdsuniversity.edu.market.seller;

public class SellerTest {

	public static void main(String[] args) {
		Seller seller = new Seller(5000, 11, 3);
		seller.this.stock = 11;
		seller.this.money = 5000;
		
		seller.sellCount(3);
		seller.sellCount(5);
		
		seller.showResult();

	}

}
