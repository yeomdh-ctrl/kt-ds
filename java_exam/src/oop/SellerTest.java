package oop;

public class SellerTest {

	public static void main(String[] args) {
		Seller seller = new Seller(5000, 11, 3);
		seller.stock = 11;
		seller.money = 5000;
		
		seller.sellCount(3);
		seller.sellCount(5);
		
		seller.showResult();

	}

}
