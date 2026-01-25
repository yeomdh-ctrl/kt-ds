package com.ktdsuniversity.edu.restaurant;


public class Restaurant {

    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void order(Customer customer, Menu menu) {

        // 음식 주문
        if (menu.getWeight() > 0) {

            int newFull = customer.getFullness() + menu.getWeight();

            if (newFull > 100) {
                System.out.println("배부름 한도 초과로 음식 주문 불가");
            } else {
                customer.setFullness(newFull);
                System.out.println(menu.getName() + " 주문 성공");
            }
        }
    
    // 술 주문
    if (menu.getAlcohol() > 0) {

        int newDrunk = customer.getDrunk() + (menu.getAlcohol() / 10);

        if (newDrunk > 100) {
            System.out.println("취함 한도 초과로 술 주문 불가");
        } else {
            customer.setDrunk(newDrunk);
            System.out.println(menu.getName() + " 주문 성공");
        }
    }
}
}

