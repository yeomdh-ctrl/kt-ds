package exam;

public class Parameter9 {
	public static double getAverage(double a, double b) {
		return Math.round(a/b);
	}
	public static void main(String[] arg) {
		double result = getAverage(150,3);
		System.out.println(result);
	}

}
