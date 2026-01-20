package exam;

public class Parameter4 {
	public static void printAge(int age) {
		if(age >= 20) {
			System.out.println("성인");
		}
		else {
			System.out.println("미성년");
		}
	}

	public static void main(String[] args) {
		printAge(20);
		printAge(15);

	}

}
