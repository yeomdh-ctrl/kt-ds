package java_exam;

public class MethodExam {
	
	public static int computeAdd(int number1, int number2) {
		int computeResult = number1 + number2;
		return computeResult;
	}
	
	public static void printMyName(String name) {
		System.out.println("제 이름은" + name +"입니다.");
		
		if(name.length()<3) {
			return;
		}
		
		System.out.println("제 이름은" + name.length() + "글자입니다");
	}
	
	// 프로그램이 실행될 수 있는 메소드를 생성한다.
	public static void main(String[] args) {
		
		int resultAdd = computeAdd(19, 21);
		System.out.println(resultAdd);
		
//		System.out.println("제 이름은 홍길동입니다.");
//		System.out.println("제 이름은 땡땡땡입니다.");
//		System.out.println("제 이름은 000입니다.");
		printMyName("길동"); //파라미터 변수로 값을 보냄
		printMyName("000");
		printMyName("123");
	}

}
