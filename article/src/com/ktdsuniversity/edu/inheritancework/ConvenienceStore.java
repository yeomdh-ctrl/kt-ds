package com.ktdsuniversity.edu.inheritancework;

public class ConvenienceStore extends Shop{
	public ConvenienceStore() {
		super("편의점");
	}

	@Override
	public int sell(Customer customer, int price, int payMoney) {
		
        if (customer.getPoint() >= 100) {
            System.out.println("포인트 전액 사용: " + customer.getPoint());
            price -= customer.getPoint();
            customer.setPoint(0);
        }
        if(price > customer.getMoney() + customer.getPoint()) {
        	System.out.println("포인트 + 돈이 부족합니다");
        	return payMoney;
        }

        int change = payMoney - price;
        customer.setMoney(customer.getMoney() - payMoney);

        int savePoint = (int)(price * 0.001);
        customer.setPoint(customer.getPoint() + savePoint);

        System.out.println(shopName + " 구매 완료");
        System.out.println("거스름돈: " + change);
        System.out.println("적립 포인트: " + savePoint);
		return 0;
    }


}
