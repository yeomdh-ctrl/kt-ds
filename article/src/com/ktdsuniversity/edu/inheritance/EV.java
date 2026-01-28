package com.ktdsuniversity.edu.inheritance;

public class EV extends Vehicle {
	private int batteryAmount;
	public EV(String name, boolean engine, int batteryAmount) {
		super(name, engine, "징");
	}
	public void batteryCheck() {
		if(this.batteryAmount <= 0) {
			super.engine = false;
			System.out.println("배터리 부족");
			return;
		}
		else {
			super.engine = true;
			System.out.println("배터리가" + this.batteryAmount + "만큼 있음");
		}
	}
}
