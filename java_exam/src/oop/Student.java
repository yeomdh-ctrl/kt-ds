package oop;

public class Student {
	int java;
	int python;
	int cpp;
	int csharp;
	
	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}
	
	public int getSumAllScores() {
		return java + python + cpp + csharp;
	}
	public double getAverage() {
		int average = (int)(getSumAllScores()/4.0 * 100);
		return average/100.0;
	}
	public double getCourseCredit() {
		double courseCredit = (int)((getAverage()-55)/10.0*100); 
		return courseCredit/100.0;
	}
	public String getABCDEF() {
		if(getCourseCredit() >= 4.1) {
			return "A+";
		}
		else if(getCourseCredit() >= 3.6) {
			return "A";
		}
		else if(getCourseCredit() >= 3.1) {
			return "B+";
		}
		else if(getCourseCredit() >= 2.6) {
			return "B";
		}
		else if(getCourseCredit() >= 1.6) {
			return "C";
		}
		else if(getCourseCredit() >= 0.6) {
			return "D";
		}
		else {
			return "F";
		}
	}
}
