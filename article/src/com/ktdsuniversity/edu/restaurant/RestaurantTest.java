package com.ktdsuniversity.edu.restaurant;

public class RestaurantTest {

    public static void main(String[] args) {

        // 식당 2개 (기준 다름)
        Restaurant res1 = new Restaurant("한식집");
        Restaurant res2 = new Restaurant("술집");

        // 손님
        Customer c1 = new Customer("A");

        // 메뉴 2종 (음식, 술)
        Menu food = new Menu("비빔밥", 40, 0);
        Menu drink = new Menu("소주", 0, 900);

        System.out.println("한식집");
        res1.order(c1, food);
        res1.order(c1, food);
        res1.order(c1, food);
        res1.order(c1, drink);
        res1.order(c1, drink);

        System.out.println("배부름: " + c1.getFullness());
        System.out.println("취함: " + c1.getDrunk());

        System.out.println("술집");
        res2.order(c1, drink);
        res2.order(c1, drink);
        res2.order(c1, drink);

        System.out.println("배부름: " + c1.getFullness());
        System.out.println("취함: " + c1.getDrunk());
    }
}

