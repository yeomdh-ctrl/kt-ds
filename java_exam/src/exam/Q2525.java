package exam;

public class Q2525 {

	public static void main(String[] args) {
		int h = 23;
		int m = 48;
		
		int cookTime = 25;
		
		if (cookTime >= 1440) {
			int days = cookTime / 1440;
			cookTime -= 1440 * days;
		}
		
		int minutes = h * 60 + m;
		minutes += cookTime;
		if (minutes > 24 * 60) { // 요리가 끝난 시간이 하루를 넘어가면
			minutes -= 24 * 60; // 요리가 끝난 시간에서 하루를 뺀다.
		}
		
		int endH = minutes /60;
		int endM = minutes % 60;
		
		System.out.println(endH + " "+endM);
				

	}

}
