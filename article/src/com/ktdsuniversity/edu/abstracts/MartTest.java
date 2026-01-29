package com.ktdsuniversity.edu.abstracts;

public class MartTest {
	public static void main(String[] args) {
		Guest guest = new Guest(200000, 0);
		Guest guest2 = new Guest(7000, 300);
		Guest guest3 = new Guest(0, 12000);
		AbstractMart mart = new ConvenienceStore(1500);
		mart.sell(guest, 5, 10000);
		mart.sell(guest2, 5, 7000);
		mart.sell(guest3, 5, 0);
		
		System.out.println(guest);
		System.out.println(guest2);
		System.out.println(guest3);
	}
}
