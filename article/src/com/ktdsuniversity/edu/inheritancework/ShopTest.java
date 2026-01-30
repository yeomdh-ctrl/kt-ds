package com.ktdsuniversity.edu.inheritancework;

public class ShopTest {
	//가진돈 포인트 등급
	//손님 가격 낸돈

	public static void main(String[] args) {
		Shop mart = new Mart();
		Customer c1 = new Customer(3000, 0, " ");
		mart.sell(c1, 2000, 3000);
		
		Shop conv = new ConvenienceStore();
		Customer c2 = new Customer(2000, 1000, " ");
		conv.sell(c2, 3000, 2000);
		
		Shop dep = new DepartmentStore();
		Customer c3 = new Customer(3000, 1000, "VIP");
		dep.sell(c3, 2000, 2000);

	}

}
