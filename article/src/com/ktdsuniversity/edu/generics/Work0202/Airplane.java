package com.ktdsuniversity.edu.generics.Work0202;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * 비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.
비행기 편의 이름을 입력하세요:  0001
"0001" 편은 존재하지 않습니다.

다른 비행기 편의 이름을 입력하세요: 0002
"0002" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
1: O, 2: O, 3: O, 4: O, 5: X, 6: O, 7: O, 8: O, 9: O
좌석 예약을 하려면 번호를 입력하세요: 5
"5"번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요: 3
"3"번 좌석을 예약하시겠습니까? (y/N): y
"3"번 좌석이 예약되었습니다.
"0002" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
1: O, 2: O, 3: X, 4: O, 5: X, 6: O, 7: O, 8: O, 9: O

비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.
비행기 편의 이름을 입력하세요:  0003
"0003" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
1: X, 2: X, 3: X, 4: X, 5: X, 6: X, 7: X, 8: X, 9: X
예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.

비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.
비행기 편의 이름을 입력하세요:  0004
 */
public class Airplane {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, List<String>> flights = new HashMap<>();
		List<String> seat2 = new ArrayList<>();
		for(int i = 1; i <= 9; i++ ) {
			if(i == 5) {
				seat2.add("X");
			}
			else {
				seat2.add("O");
			}
			flights.put("0002", seat2);
		}
		List<String> seat3 = new ArrayList<>();
		for(int i = 1; i <= 9; i++ ) {
			seat3.add("X");
			flights.put("0003", seat3);
		}
		List<String> seat4 = new ArrayList<>();
		for(int i = 1; i <= 9; i++ ) {
			seat4.add("O");
			flights.put("0004", seat4);
		}
		while(true) {
			System.out.println("비행기 편의 이름을 입력하세요.");
			String flightName = sc.nextLine();
			if(!flights.containsKey(flightName)) {
				System.out.println(flightName + "편은 존재하지 않습니다.");
				continue;
			}
			else{
				System.out.println(flightName + "편의 좌석 현황입니다.");
			}
				
		}
			
	}
	

}
