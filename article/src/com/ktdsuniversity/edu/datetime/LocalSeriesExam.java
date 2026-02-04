package com.ktdsuniversity.edu.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalSeriesExam {

	public static void main(String[] args) {
		/*
		LocalDate: 날짜만 처리
		LocalTime: 시간만 처리
		LocalDateTime: 날짜와 시간 모두 처리
		*/
		//현재 날짜를 출력
		LocalDate nowDate = LocalDate.now();
		System.out.println(nowDate);
		
		//현재 시간을 출력
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime); 
		// 15:20:22.142920900 ==> 15:20:22 쓰고싶을 때. 시간/날짜 포멧 변경하는 방법 
		// 소숫점 아래는 ss.SS(필요한 자릿수 만큼)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime = dtf.format(nowTime);
		System.out.println(formattedTime);
		
		//현재 날짜와 시간을 출력
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println(nowDateTime);
		//2026-02-04T15:24:02.125588900 ==> 2026-02-04 수요일 15:24:02
		dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd E요일 HH:mm:ss");
		String formattedDateTime = dtf.format(nowDateTime);
		System.out.println(formattedDateTime);
		
		// 🍰 태어난 일이 무슨 요일인가?
		LocalDate birthdate3 = LocalDate.of(2000, 3, 2);
		System.out.println(birthdate3);
		
		DayOfWeek week = birthdate3.getDayOfWeek();
		System.out.println(week);
		
		dtf = DateTimeFormatter.ofPattern("E요일");
		String weekString = dtf.format(birthdate3);
		System.out.println(weekString);
		
		LocalDate birthdate = LocalDate.parse("2000-03-02");
		System.out.println(birthdate);
		//연도만 출력
		int birthYear = birthdate.getYear();
		System.out.println(birthYear);
		//원래 형태와 다르게 썼을 경우
		LocalDate birthdate2 = LocalDate.parse("2000년 03월 02일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		System.out.println(birthdate2);
		
		//오늘 날짜부터 19일 이후가 언제인가
		LocalDate future = LocalDate.now().plusDays(19);
		System.out.println(future);
		//오늘 날짜부터 35년 후가 언제인가
		future = LocalDate.now().plusYears(35);
		System.out.println(future);
		//오늘 날짜부터 97년 전은 언제인가
		LocalDate past = LocalDate.now().minusYears(97);
		System.out.println(past);
		//오늘 날짜부터 1300개월 이후는 언제인가
		future = LocalDate.now().plusMonths(1300);
		System.out.println(future);
		//2025년 1윌 1일은 2026년 1월 1일보다 과거인가
		LocalDate date1 = LocalDate.parse("2025-01-01");
		LocalDate date2 = LocalDate.parse("2026-01-01");
		System.out.println(date1.isBefore(date2));
		//2026년 12월 11일은 2025년 2월 5일보다 미래인가
		LocalDate date3 = LocalDate.parse("2026-12-11");
		LocalDate date4 = LocalDate.parse("2025-02-05");
		System.out.println(date3.isAfter(date4));
		Period period = Period.between(date3, date4);
		System.out.println(period); //P-1Y-10M-6D
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		long betweenDays = ChronoUnit.DAYS.between(date3, date4);
		System.out.println(betweenDays);
		
		long bewWeenYears = ChronoUnit.YEARS.between(date3, date4);
		System.out.println(bewWeenYears);
	}
}
