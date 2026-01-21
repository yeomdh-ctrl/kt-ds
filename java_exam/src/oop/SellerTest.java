package oop;

public class SellerTest {

	public static void main(String[] args) {
		Seller seller = new Seller();
		seller.stock = 11;
		seller.money = 5000;
		
		seller.sellCount(3);
		seller.sellCount(5);
		
		seller.showResult();

	}

}
