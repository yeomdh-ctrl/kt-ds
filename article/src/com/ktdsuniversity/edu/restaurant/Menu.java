package com.ktdsuniversity.edu.restaurant;

public class Menu {

    private String name;      // 메뉴 이름
    private int weight;       // 배부름 증가량
    private int alcohol;      // 알코올 도수

    public Menu(String name, int weight, int alcohol) {
        this.name = name;
        this.weight = weight;
        this.alcohol = alcohol;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAlcohol() {
        return alcohol;
    }
}

