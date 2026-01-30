package com.ktdsuniversity.edu.restaurant;

import com.ktdsuniversity.edu.exceptions.custom.NullOperatorExceptions;

public class Restaurant {

    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void order(Customer customer, Menu menu) {
    	if(customer == null) {
    		throw new NullOperatorExceptions("고객이 입력되지 않았습니다");
    	}
    	if(menu == null) {
    		throw new NullOperatorExceptions("메뉴가 입력되지 않았습니다");
    	}
    	
    	if (menu.getWeight() > 0) {

    		int newFull = customer.getFullness() + menu.getWeight();

    		if (newFull > 100) {
    			throw new FullException("배부름이 일정 수치를 초과했습니다");
//    			System.out.println("배부름 한도 초과로 음식 주문 불가");
    		} else {
    			customer.setFullness(newFull);
    			System.out.println(menu.getName() + " 주문 성공");
    		}
    	}

    	if (menu.getAlcohol() > 0) {

    		int newDrunk = customer.getDrunk() + (menu.getAlcohol() / 10);

    		if (newDrunk > 100) {
    			throw new DrunkenException("취함이 일정 수치를 초과했습니다");
//    			System.out.println("취함 한도 초과로 술 주문 불가");
    		} else {
			customer.setDrunk(newDrunk);
			System.out.println(menu.getName() + " 주문 성공");
    		}
    }
}
}

