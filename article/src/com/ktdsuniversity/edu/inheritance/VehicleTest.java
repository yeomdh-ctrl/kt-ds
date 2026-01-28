package com.ktdsuniversity.edu.inheritance;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle car1 = new SportsCar("스포츠카", true, false);
		car1.carName();
		car1.startEngine();
		if(car1 instanceof SportsCar sportscar) {
			sportscar.modeOn();
		}

	}

}
