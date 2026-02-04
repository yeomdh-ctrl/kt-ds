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
	 //생성자 오버로딩
	 public CoffeeShop() {
//		 this.hot = new Coffee("기본 아메리카노", 1500, 30);
//		 this.ice = new Coffee("아이스 아메리카노", 1500, 50);
//		 this() 를 사용해 밑에 있는 hot , ice 를 받아옴.
		 this(new Coffee(Menu.HOT, 1500, 30)
			 ,new Coffee(Menu.ICE, 1500, 50));
	 }
	
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
	//메소드 오버로딩
	/**
	 * 가장 첫 번째 메뉴를 한 개 주문한다.
	 * @return
	 */
	public int orederCoffee() {
		int price = this.orderCoffee(Menu.HOT);
		return price;
	}
	/**
	 * 메뉴 한개만 주문한다.
	 * @param menu
	 * @return
	 */
	public int orderCoffee(Menu menu) {
		int price = this.orderCoffee(menu , 1);
		return price;
	}
	
	/**
	 * 커피숍에서 커피를 판매한다
	 * @param menu 메뉴들의 번호. 1: hot, 2:ice
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 */
	public int orderCoffee(Menu menu, int quantity) {
		// TODO 주문한 음료의 재고가 quantity 보다 모자라면 판매하지 않는다
		// TODO 음료를 판매하면 재고가 quantity  만큼 감소한다.
		
		
		if(menu == Menu.HOT) {
			if(this.hot.getStock() >= quantity) {
				int stock = this.hot.getStock();
				stock -= quantity;
				this.hot.setStock(stock);
				System.out.println(this.hot.getMenu() + "음료를" + quantity + "개 주문 받았습니다." + this.hot.getStock());			
				return this.hot.getPrice() * quantity;	
			}
			else {
				return 0;
			}
		}
		else if(menu == Menu.ICE) {
			if(this.ice.getStock() >= quantity) {
				int stock = this.ice.getStock();
				stock -= quantity;
				this.ice.setStock(stock);
				System.out.println(this.ice.getMenu() + "음료를" + quantity + "개 주문 받았습니다." + this.ice.getStock());
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
