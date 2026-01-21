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
			sellCount = stock; //판매자가 소지한 상품의 개수보다 더 많은 개수의 상품을 판매하려 할 경우, 남은 모든 재고를 판매
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
