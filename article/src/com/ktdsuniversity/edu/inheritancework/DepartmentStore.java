package com.ktdsuniversity.edu.inheritancework;

public class DepartmentStore extends Shop {

    public DepartmentStore() {
        super("백화점");
    }

    @Override
    public int sell(Customer customer, int price, int payMoney) {

        int savePoint = 0;


        if (customer.getGrade().equals("VIP")) {
            price = (int)(price * 0.97);
        } 
        else if (customer.getGrade().equals("VVIP")) {
            price = (int)(price * 0.90);
            savePoint = (int)(price * 0.03);
        } 
        else {
            savePoint = (int)(price * 0.005);
        }

        System.out.println("할인 후 가격: " + price);


        if (customer.getPoint() >= 10000) {

            int usePoint;

            if (customer.getPoint() >= price) {
                usePoint = price;
            } else {
                usePoint = customer.getPoint();
            }

            price -= usePoint;
            customer.setPoint(customer.getPoint() - usePoint);

            System.out.println("사용 포인트: " + usePoint);
        }


        if (price == 0) {       
            System.out.println(shopName + " 포인트로 결제 완료");
            System.out.println("거스름돈: 0");
        } 
        else {
            if (payMoney < price) {
                System.out.println("돈이 부족합니다");
                return payMoney;
            }

            int change = payMoney - price;
            customer.setMoney(customer.getMoney() - payMoney);

            System.out.println(shopName + " 구매 완료");
            System.out.println("거스름돈: " + change);
        }


        customer.setPoint(customer.getPoint() + savePoint);
        System.out.println("적립 포인트: " + savePoint);

        return 0;
    }
}

