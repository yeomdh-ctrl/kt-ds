package oop;

public class Seller {
	final int price = 1000;
	int money;
	int stock;
	int sellCount;
	
	public int sellCount(int count) {
		if(stock == 0) {
			System.out.println("품절되었습니다");
			return 0;
		}
		else if(count > stock) {
			sellCount = stock;
		}
		else {
			sellCount = count;
		}
		stock -= sellCount;
		money += sellCount * price;
		return sellCount;
	}
	public void showResult() {
		System.out.println("재고 수: " + stock);
		System.out.println("자본금: " + money);
	}
}
