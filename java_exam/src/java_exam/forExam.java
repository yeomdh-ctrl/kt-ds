package java_exam;

public class forExam {

	public static void main(String[] args) {
		int sum = 0;
		//for(int i=1; i < 101; i++) {
		//	sum = sum + i;
		//	System.out.println(sum);
		
		
		//for(int i = 1; i < 101; i++) {
		//	if(i % 2 != 0) {
		//		sum += i;
		//	}
		//	System.out.println(sum);
		//}
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
			}
		}
				
	}

}
