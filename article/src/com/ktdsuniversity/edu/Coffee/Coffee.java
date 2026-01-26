package com.ktdsuniversity.edu.Coffee;
/**
 * 커피 메뉴를 나타내는 데이터 클래스
 */
public class Coffee {
	/**
	 * 커피 메뉴의 이름
	 */
	private String name;
	/**
	 * 커피 메뉴의 가격
	 */
	private int price;
	/**
	 * 하루동안 판매할 수 있는 커피의 양
	 */
	private int stock;
	
	public Coffee(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public static boolean isPositiveNumber(int number) {
//		System.out.println(this.stock); this 사용 불가능
		return number > 0;
	}
	
	// getter : Coffee 클래스 외부로 멤버 변수의 값을 노출시키는 코드
	// setter : 외부에서 Coffee 클래스 내부로 멤버 변수의 값을 변경시키는 코드
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getStock() {
		return this.stock;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setStock(int stock) {
		if(Coffee.isPositiveNumber(stock))
		this.stock = stock;
	}
}
