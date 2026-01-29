package com.ktdsuniversity.edu.inheritancework;

public class ShopTest {

	public static void main(String[] args) {
		Shop mart = new Mart("supermart");
		Customer c1 = new Customer("c1", 3000, 0, " ");
		mart.sell(c1, 2000, 3000);


	}

}
