package oop;

public class Buyer {

	final int PRICE = 1000;
	final int PRODUCT_WEIGHT = 500;
	
	int maxCartWeight;
	int nowCartWeight;
	
	int itemCount;
	int wallet;
	
	public boolean isEnoughMoney(int productCount) {
		return wallet >= PRICE * productCount;
	}
	
	public boolean isEnoughWeight(int productCount) {
		int predictWeigth = PRODUCT_WEIGHT * productCount + nowCartWeight; 
		return maxCartWeight >= predictWeigth;
	}
	
	public void buy(int productCount) {
		if ( ! isEnoughMoney(productCount) ) {
			System.out.println("돈이 부족합니다.");
		}
		else if ( ! isEnoughWeight(productCount) ) {
			System.out.println("더 이상 장바구니를 들 수 없습니다.");
		}
		else {
			wallet -= productCount * PRICE;
			itemCount += productCount; 
			nowCartWeight += productCount * PRODUCT_WEIGHT;
		}
		
		System.out.println("상품의 수: " + itemCount);
		System.out.println("장바구니의 무게: " + nowCartWeight);
		System.out.println("지갑에 있는 돈: " + wallet);
		
		
	}
	
}