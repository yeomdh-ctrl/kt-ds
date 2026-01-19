package exam;

public class Q2884 {

	public static void main(String[] args) {
		int earlyMinutes = 45; //미리 알람을 맞출 시간
		int h = 0;
		int m = 30;
		
		int minutes = h * 60 + m; // 현재 시간을 분으로 환산
		
		if (minutes < earlyMinutes) { // 현재 시간이 45분보다 작을때
			earlyMinutes -= minutes; // 알람시간에서 현재 분을 뺀다
			minutes = 24 * 60;} // 현재 분을 하루의 최대 분으로 수정한다
	
		minutes -= earlyMinutes; // 현재 분에서 알람시간을 뺀다
		
		int alarmH = minutes / 60;
		int alarmM = minutes % 60;
		
		System.out.println(alarmH + " " + alarmM);
	}
}
