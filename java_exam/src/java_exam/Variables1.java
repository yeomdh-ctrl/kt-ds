package java_exam;

public class Variables1 {

	public static void main(String[] args) {
		// 중요한 타입(int, long, float double, boolean)
		// 나이가 몇 살인지 구해보는 나이 계산기
		// 현재 연도 - 나의 생년
		System.out.println(2026 - 2000 + 1);
		// Var Naming Convention
		// 1.첫번째 단어의 첫번째 글자는 소문자로 작성
		// 2. 두번째 이후의 단어의 첫번째 글자만 대문자로 작성(Camel Case)
		// 3. 특수기호나 숫자로 시작할 수 없다.
		//	  사용가능한 특수기호: ( _ ) <-- 권장하지 않음.
		{
			int nowYear = 2026;
			int myBirthYear = 2000;
			int myAge = nowYear - myBirthYear + 1;
			
			System.out.println(myAge);
		}
		
		final long price = 1000;
		long buildingPrice = 10_000_000_000L;
		
		float ratio = 5.111F;
		
		double doubleRatio = 123123.123123123;
		
		//price = 10_000; --> 변경 불가 에러
		System.out.println("계산 끝났습니다.");
		
		int a = (int)1L;
		System.out.println(a);
		
		byte num = 127;
		num += 1;
		System.out.println(num);
		
		long number = Integer.MAX_VALUE;
		number = number + 1;
		System.out.println(number);
		
		byte bNumber = 127;
		//bNumber = bNumber + (byte)1;
		bNumber = (byte)(bNumber + 1);
		System.out.println(bNumber);
		
		long longNumber = 2147483649L;
		System.out.println(longNumber);
		int shortNumber = (int)longNumber;
		System.out.println(shortNumber);
		// 2147483649L 뒤에 숫자를 하나씩 늘리면 2진법 계산 + 9이후 나머지 자리
		
		
		System.out.println("3 + 7의 결과는" + (3 + 7));
		
		System.out.println(10L + 3.5f);
		
		System.out.println((float)10/3);
		System.out.println(10/(float)3);
		
		System.out.println(10f/3);
		System.out.println(10/3f);

	}
	

}
