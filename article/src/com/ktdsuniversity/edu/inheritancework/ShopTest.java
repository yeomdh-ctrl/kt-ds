package com.ktdsuniversity.edu.inheritancework;

public class ShopTest {

	public static void main(String[] args) {
		Shop mart = new Mart("사과", 20, 3000, 4000, 24);
		mart.refund();
		mart.orderProduct();

	}

}
