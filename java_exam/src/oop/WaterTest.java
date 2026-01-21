package oop;

public class WaterTest {

	public static void main(String[] args) {
		Water water = new Water();
		water.powerOff();
		water.fillWater(30);
		water.dispenseWater(10);
		water.powerOn();
		water.dispenseWater(40);
		water.fillWater(20);
		water.dispenseWater(20);
		

	}

}
