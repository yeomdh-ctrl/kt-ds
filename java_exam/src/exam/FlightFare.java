package exam;

public class FlightFare {
	
	public static int getFlightFare(int age) {
		if(age >= 19) {
			return 300_000;
		}
		else{
			return 100_000;
		}
	}

	public static void main(String[] args) {
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		//Case 1.비행 요금을 계산
		int flightFare = 0;
		flightFare = getFlightFare(father);
		flightFare = getFlightFare(mother);
		flightFare = getFlightFare(daughter);
		
		if (flightFare > money) {
			System.out.println("다음에 가자");
		}
		else {
			System.out.println("가자");
		}
		//Case 2. 성인의수, 아동의 수
		//int adultCount = 0;
		//int kidCount = 0;
		//flightFare = adultCount * adultOneWayFlightFare + kidCount * kidOneWayFlightFare
		//Case 3. 비행요금, 케이스 계산 x
		//		  삼항 연산.==>if else 대체.(권장 X)
		//flightFare = father >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		//flightFare += mother >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		//flightFare += daughter >= 19 ? adultOneWayFlightFare : kidOneWayFlightFare;
		//if (flightFare > money) {
		//	System.out.println("다음에가자");
		//}

	}

}
