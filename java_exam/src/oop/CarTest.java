package oop;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car kona = new Car();
		System.out.println(kona);
		kona.pressEngineStartButton();//코나의 시동을 건다.
		kona.pressGasolinePedal(20); //speed의 값은 30이 된다.
		// kona의 엔진 상태를 출력한다.
		boolean konaEngineState = kona.isEngineStart;
		System.out.println("Kona Engine: "+ konaEngineState);
		// kona의 현재 속도를 출력한다.
		int konaSpeed = kona.speed;
		System.out.println("Kona speed: " + konaSpeed);
		
		Car carnival = new Car();
		System.out.println(carnival);
		
		carnival.pressGasolinePedal(200);//시동을 켜지 않았기 때문에 속도는 0
		carnival.pressEngineStartButton();
		carnival.pressBrakePedal(10);
		carnival.pressBrakePedal(10); //speed는 0이상으로 설정했기에 음수로 떨어지지 않음
		
		boolean carnivalEngineState = carnival.isEngineStart;
		System.out.println("Carnival Engine: "+ carnivalEngineState);
		
		int carnivalSpeed = carnival.speed;
		System.out.println("Carnival speed: "+ carnivalSpeed);
		
	}

}
