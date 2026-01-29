package com.ktdsuniversity.edu.abstracts;

public class MartTest {
	public static void main(String[] args) {
		
		int point = 1000000;
		int usePoint = (int)(Math.random()*point + 1);
		System.out.println(usePoint);
		
		Guest guest = new Guest(200000, 0);
		Guest guest2 = new VIP(50000, 300);
		Guest guest3 = new VVIP(0, 12000);
		AbstractMart mart = new DepartmentStore(1500);
		mart.sell(guest, 5, 10000);
		mart.sell(guest2, 5, 7000);
		mart.sell(guest3, 5, 0);
		
		System.out.println(guest);
		System.out.println(guest2);
		System.out.println(guest3);
	}
}
