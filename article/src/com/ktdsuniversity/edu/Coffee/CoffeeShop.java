package com.ktdsuniversity.edu.Coffee;

import com.ktdsuniversity.edu.Coffee.CoffeeShop;

public class CoffeeShop {
	/**
	 * 커피숍에서 파는 따뜻한 아메리카노
	 */
	 private Coffee hot;
	/**
	 * 커피숍에서 파는 차가운 아메리카노
	 */
	 private Coffee ice;
	
	public CoffeeShop(Coffee hot, Coffee ice) {
		this.hot = hot;
		this.ice = ice;
	}
	public Coffee getIce() {
		return this.ice;
	}
	public Coffee getHot() {
		return this.hot;
	}
	public void setIce(Coffee ice) {
		this.ice = ice;
	}
	public void setHot(Coffee hot) {
		this.hot = hot;
	}
	
	/**
	 * 커피숍에서 커피를 판매한다
	 * @param menu 메뉴들의 번호. 1: hot, 2:ice
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 */
	public int orderCoffee(int menu, int quantity) {
		// TODO 주문한 음료의 재고가 quantity 보다 모자라면 판매하지 않는다
		// TODO 음료를 판매하면 재고가 quantity  만큼 감소한다.
		
		
		if(menu == 1) {
			if(this.hot.getStock() >= quantity) {
				int stock = this.hot.getStock();
				stock -= quantity;
				this.hot.setStock(stock);
				System.out.println(this.hot.getName() + "음료를" + quantity + "개 주문 받았습니다." + this.hot.getStock());			
				return this.hot.getPrice() * quantity;	
			}
			else {
				return 0;
			}
		}
		else if(menu == 2) {
			if(this.ice.getStock() >= quantity) {
				int stock = this.ice.getStock();
				stock -= quantity;
				this.ice.setStock(stock);
				System.out.println(this.ice.getName() + "음료를" + quantity + "개 주문 받았습니다." + this.ice.getStock());
				return this.ice.getPrice() * quantity;
			}
			else {
				return 0;
			}
		}
		else {
			System.out.println("존재하지 않는 음료입니다.");
			return 0;
		}
		
	}

}
