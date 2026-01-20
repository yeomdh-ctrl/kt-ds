package java_exam;

public class ArrayExam {

	public static void main(String[] args) {
		
//		int [] scoreArray = new int[7];
//		scoreArray[0] = 18;
//		scoreArray[1] = 22;
//		scoreArray[4] = 55;
//		scoreArray[2] = 123;
//		scoreArray[3] = 547;
//		scoreArray[6] = 185;
//		scoreArray[5] = 15;
//		scoreArray[7] = 8585; 에러발생
//		int i=0;
//		for(i=0; i<=6; i++) {
//			System.out.println(scoreArray[i]);
//		}
//		for(int i = 0; i < scoreArray.length; i++) {
//			scoreArray[i]=(int)(Math.random() * 45 + 1);
//		}
//		
//		for(int i = 0; i < scoreArray.length; i++) {
//			System.out.println(scoreArray[i]);
//		}
				
//		System.out.println(scoreArray[0]);
//		System.out.println(scoreArray[1]);
//		System.out.println(scoreArray[2]);
//		System.out.println(scoreArray[3]);
//		System.out.println(scoreArray[4]);
//		System.out.println(scoreArray[5]);
//		System.out.println(scoreArray[6]);
		
		// 0 | 0 | 0 | 0 | 0 | 0 | 0
//		System.out.println(scoreArray); //???
//		
//		int score = 60;
//		System.out.println(score);
		//int  scoreArray2[] = new int[7];
		
		
		// 서로 다른 숫자 7개가 배열에 할당 될때까지 반복
		// 1. 배열에 채워진 숫자의 개수가 7개 인가?
//			
		int [] lottoNums = new int[7];
		int count = 0;
		boolean exist = false;
		int randomNumber = 0;
		while(count < 7) {
			randomNumber = (int)(Math.random()*45+1);
			exist = false;
			
			for(int i = 0; i < count; i++) {
				if(lottoNums[i] == randomNumber) {
					exist = true;
					break;
				}
			}
			if(!exist) {
				lottoNums[count] = randomNumber;
				count++;
			}
		}		
		for(int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i]+" ");
		}
		System.out.println("");
		
		
		
		
		int[] numbers = new int[7];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*45+1);
			
			for(int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("");
	}
}
