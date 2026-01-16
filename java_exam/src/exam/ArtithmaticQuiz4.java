package exam;

public class ArtithmaticQuiz4 {

	public static void main(String[] args) {
		int subjectA = 100;
		int subjectB = 80;
		int subjectC = 95;
		int subjectD = 68;
		
		int totalScore = subjectA + subjectB + subjectC + subjectD; // 모든 과목들의 합
		double average = totalScore / 4d; // 평균 점수
		double score = average-55;// 4.5 만점 기준 학점 계산. 소수점 이하 두자리까지.
						 //(평균점수 - 55) 에서 소수점 계산 100 => 4.5
		score = score * 10; // score *= 10;
		score = Math.round(score);
		score = score / 100; // score /= 100;
		System.out.println("점수총합:"+totalScore);
		System.out.println("점수평균:"+average);
		System.out.println("학점결과:"+score);
		

	}

}
