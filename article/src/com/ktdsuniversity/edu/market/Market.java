package com.ktdsuniversity.edu.market;
import com.ktdsuniversity.edu.market.seller2.Seller2;
import com.ktdsuniversity.edu.market.buyer.Buyer;


public class Market {
	public static void main(String[] args) {
		
		
		Buyer buyer = new Buyer(5000, 3000);
		Seller2 seller = new Seller2(30);
		
		//구매자가 판매자에게 제품을 5개 구매한다.
		buyer.buyFrom(seller, 5);
		
		System.out.println("구매개수: " + buyer.getItemCount());
		System.out.println("중량: " + buyer.getNowCartWeight());
		System.out.println("지갑: " + buyer.getWallet());
		
		System.out.println("재고: " + seller.getStock());
		System.out.println("자본금: " + seller.getAccount());
		
		// 구매자가 상품을 구매하려면 판매자가 판매를 먼저 해야한다.
		
//		int stock = seller.getStock();
//		int price = seller.getPRICE();
//		int weight = seller.getPRODUCT_WEIGHT();
//		
//		if(stock >= 5 && buyer.isEnoughMoney(price*5) && buyer.isEnoughWeight(weight * 5)) {
//			seller.sell2(5);
//			buyer.buy(price * 5, weight * 5, 5);			
//		}
		
	}
}
