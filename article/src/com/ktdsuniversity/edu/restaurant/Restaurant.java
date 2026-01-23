package com.ktdsuniversity.edu.restaurant;

public class Restaurant {
	private String restaurantName;
	private String menu;
	private int full;
	private int foodWeight;
	private double alcohol;
	private double alcoholRate;
	
	public Restaurant(String resturantName, String menu) {
		this.restaurantName = restaurantName;
		this.menu = menu;
	}
	public String getRestaurantName() {
		return this.restaurantName;
	}
	public String getMenu() {
		return this.menu;
	}
	public int getFull() {
		return this.full;
	}
	public int getFoodWeight() {
		return this.foodWeight = foodWeight;
	}
	public double getAlcohol() {
		return this.alcohol;
	}
	public double getAlcoholRate() {
		return this.alcoholRate;
		}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public void setFull(int full) {
		this.full = full;
	}
	public void setFoodWeight(int foodWeight) {
		this.foodWeight = foodWeight;
	}
	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}
	public void setAlcoholRate(double alcoholRate) {
		this.alcoholRate = alcoholRate;
	}
	public void isFull(int full) {
		if(full >= 100) {
			System.out.println("주문 받지 않음");
		}
	}
}
