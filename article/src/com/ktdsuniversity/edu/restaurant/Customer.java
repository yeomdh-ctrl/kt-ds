package com.ktdsuniversity.edu.restaurant;

public class Customer {
	private int fullness;
	private int drunkness;
	
	public int getFullness() {
		return this.fullness = fullness;
	}
	public int getDrunkness() {
		return this.drunkness = drunkness;
	}
	public void setFullness(int fullness) {
		if(fullness > 100) {
			fullness = 100;
		}
		this.fullness = fullness;
	}
	public void setDrunkness(int drunkness) {
		if(drunkness > 100) {
			drunkness = 100;
		}
		this.drunkness = drunkness;
	}

}
