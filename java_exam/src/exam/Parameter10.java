package exam;

public class Parameter10 {
	public static String getGrade(int score) {
		if(score >= 95) {
			return ("A");
		}
		else if(score >=85) {
			return ("B");
		}
		else if(score >=75) {
			return ("C");
		}
		else if(score >=65) {
			return ("D");
		}
		else {
			return ("F");
		}
	}

	public static void main(String[] args) {
		String result = getGrade(80); 
		System.out.println(result);

	}

}
