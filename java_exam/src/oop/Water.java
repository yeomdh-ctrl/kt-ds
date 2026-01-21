package oop;

public class Water {
	
	boolean power;
	int waterAmount;
	
	public void powerOn() {
			power = true;
			System.out.println("전원 켜짐");
	}
	public void powerOff() {
			power = false;
			System.out.println("전원 꺼짐");
	}
	public void fillWater(int amount) {
		waterAmount += amount;
		System.out.println(amount + "ml의 물을 채웠음");
	}
	public void dispenseWater(int amount) {
		if(!power) {
			System.out.println("전원 꺼져있음");
			return;
		}
		if(waterAmount > amount) {
			waterAmount -= amount;
			if(amount < 0) {
				amount = 0;
			}
			System.out.println(amount + "ml의 물이 나왔음");
		}
		else {
			System.out.println("물이 부족함");
		}
	}	
}
