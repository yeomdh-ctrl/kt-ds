package com.ktdsuniversity.edu.restaurant;

public class RestaurantTest {

    public static void main(String[] args) {


        Restaurant res1 = new Restaurant("한식집");
        Restaurant res2 = new Restaurant("술집");


        Customer c1 = new Customer("A");


//        Menu food = new Menu("비빔밥", 40, 0);
//        Menu drink = new Menu("소주", 0, 900);
        
        Menu food = new Menu("비빔밥", 4, 0);
        Menu drink = new Menu("소주", 0, 90);

        System.out.println("한식집");
//        res1.order(null,food);
//        res1.order(c1, null);
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

