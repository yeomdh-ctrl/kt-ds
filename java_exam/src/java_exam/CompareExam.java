package java_exam;

public class CompareExam {

	public static void main(String[] args) {
		int age = 10;
		
		// age가 10대 인지 확인해본다.
		// 10 <= age < 20
		// 10대가 맞다면 true를 아니라면 false를 출력한다
		boolean isTeenager = 10 <= age && age < 20;
		System.out.println(isTeenager);
		
		// age가 20대 인지 확인해본다.
		// 20 <= age < 30
		// 20대가 맞다면 true를 아니라면 false를 출력한다
		boolean idAdult = 20 <= age && age < 30;
		System.out.println(idAdult);
		
		// 가게에 방문한 고객의 나이
		int customerAge = 15;
		// 고객의 지갑에 들어있는 돈
		int customerWallet = 3000;
		
		// A가게에는 19세 이상의 고객만 방문할 수 있다.
		// A가게에서 판매하는 모든 제품의 가격은 1500원이다.
		//고객이 가게에서 구매할 수 있다면 True, 아니면 False를 출력한다.(빠른연산 고려)
		boolean isAvailable = 19 <= customerAge && 1500 <= customerWallet;
		System.out.println(isAvailable);
		
		// B가게는 19세 이상의 고객만 방문할 수 있다.
		// B가게에서 판매하는 모든 제품의 가격은 2000원이다.
		// B가게는 특별이벤트로 고객의 나이가 3의 배수이면 돈이 모자라더라도 구매할 수 있게 하고 있다.
		// 고객은 가게에서 제품을 구매할 수 있다면 true, 아니라면 false를 출력한다.(빠른연산고려)
		customerAge = 21;
		customerWallet = 1300;
		// c = customerWallet >= 2000 && (customerAge >= 19 || customerAge % 3 == 0);
		isAvailable = customerAge >= 19 && customerWallet >= 2000;
		isAvailable = isAvailable || customerAge % 3 == 0;
		System.out.println(isAvailable);
		// 다른방법
		// boolean isAdult = customerAge >= 19;
		// isAvailable = customerWallet >= 2000 || customerAge % 3 == 0;
		// System.out.println(isAdult && isAvailable)
		
		// 빠른 연산 지원 기능
		boolean canBuy = customerAge >= 19;
		// canBuy = canBuy && (customerWallet >= 2000 || customerAge % 3 == 0);
		canBuy &= (customerWallet >= 2000 || customerAge % 3 == 0);
		System.out.println(canBuy);
		
		
		
	}

}
