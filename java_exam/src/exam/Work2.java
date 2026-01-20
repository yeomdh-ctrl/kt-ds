package exam;

public class Work2 {
	public static String computeGrade(int a, int b, int c, int d, int e) {
		int amount = a + b + c + d + e;
		double average = calcAverage(amount, 5);
		String grade = calcGrade(average);
		return grade;
		
	}
	public static double calcAverage(int amount, int subjectCount) {
		return (double)(amount / subjectCount);
	}
	public static String calcGrade(double average) {
		if(average >= 90) {
			return "A";
		}
		else if(average >= 80) {
			return "B";
		}
		else if(average >= 70) {
			return "C";
		}
		else if(average >= 60) {
			return "D";
		}
		else {
			return "F";
		}
	}

	public static void main(String[] args) {
		String grade = computeGrade(100, 95, 95, 100, 100);
		System.out.println(grade);
	}

}
