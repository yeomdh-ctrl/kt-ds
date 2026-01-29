package com.ktdsuniversity.edu.inheritancework;

public class ShopTest {

	public static void main(String[] args) {
		Shop mart = new Mart();
		Customer c1 = new Customer(3000, 0, " ");
		mart.sell(c1, 2000, 1000);
		
		Shop conv = new ConvenienceStore();
		Customer c2 = new Customer(3000, 1000, " ");
		conv.sell(c2, 2000, 1000);


	}

}
