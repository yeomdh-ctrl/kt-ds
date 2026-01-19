package exam;

public class Q14681 {

	public static void main(String[] args) {
		int X = 12;
		int Y = 5;
		if (X > 0 && Y >0){
			System.out.println("Quadrant1");
		}
		else if (X < 0 && Y > 0){
			System.out.println("Quadrant2");
		}
		else if (X < 0 && Y < 0){
			System.out.println("Quadrant3");
		}
		else {
			System.out.println("Quadrant4");
		}
	}

}
