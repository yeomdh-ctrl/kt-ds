package com.ktdsuniversity.edu.restaurant;

public class Customer {

    private String name;
    private int fullness;   // 배부름 정도
    private int drunk;      // 취함 정도

    public Customer(String name) {
        this.name = name;
        this.fullness = 0;
        this.drunk = 0;
    }

    public String getName() {
        return name;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getDrunk() {
        return drunk;
    }

    public void setDrunk(int drunk) {
        this.drunk = drunk;
    }
}

