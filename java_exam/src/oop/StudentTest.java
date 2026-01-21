package oop;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.java = 100;
		student.python = 97;
		student.cpp = 81;
		student.csharp = 99;
		
		int sum = student.getSumAllScores();
		double average = student.getAverage();
		double courseCredit = student.getCourseCredit();
		String abcde = student.getABCDEF();
		
		System.out.println(sum);
		System.out.println(average);
		System.out.println(courseCredit);
		System.out.println(abcde);

	}

}
