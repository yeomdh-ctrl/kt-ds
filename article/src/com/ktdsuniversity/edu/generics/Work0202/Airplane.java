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
        
        Scanner scanner = new Scanner(System.in);
        
        Map<String, List<String>> flights = new HashMap<>();

        List<String> seats2 = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            seats2.add("O"); 
        }
        seats2.set(4, "X"); 
        flights.put("0002", seats2);

        List<String> seats3 = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            seats3.add("X");
        }
        flights.put("0003", seats3);

        while (true) {
            System.out.println("비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.");
            System.out.print("비행기 편의 이름을 입력하세요: ");
            String flightName = scanner.next();

            if (!flights.containsKey(flightName)) {
                System.out.println( flightName + "편은 존재하지 않습니다.");
                continue;
            }
            
            List<String> currentSeats = flights.get(flightName);
            
            boolean hasAvailableSeat = false;
            for (String status : currentSeats) {
                if (status.equals("O")) {
                    hasAvailableSeat = true;
                    break;
                }
            }

            System.out.println(flightName + "편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
            for (int i = 0; i < currentSeats.size(); i++) {
                System.out.print((i + 1) + ": " + currentSeats.get(i));
                if (i < currentSeats.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();

            if (!hasAvailableSeat) {
                System.out.println("예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.");
                continue;
            }
            
            while (true) {
                System.out.print("\n좌석 예약을 하려면 번호를 입력하세요: ");
                int seatNum = scanner.nextInt();
                int seatIndex = seatNum - 1; 

                if (seatIndex < 0 || seatIndex >= currentSeats.size()) {
                    System.out.println("잘못된 좌석 번호입니다. 다시 입력하세요.");
                    continue;
                }

                if (currentSeats.get(seatIndex).equals("X")) {
                    System.out.println(seatNum + "번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요.");
                    continue; 
                }

                System.out.print(seatNum + "번 좌석을 예약하시겠습니까? (y/n): ");
                String answer = scanner.next();

                if (answer.equals("y")) {
                    currentSeats.set(seatIndex, "X");
                    System.out.println(seatNum + "번 좌석이 예약되었습니다.");

                    // 변경된 현황 다시 보여주기
                    System.out.println(flightName + "편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
                    for (int i = 0; i < currentSeats.size(); i++) {
                        System.out.print((i + 1) + ": " + currentSeats.get(i));
                        if (i < currentSeats.size() - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                    break; // 예약 완료
                	} 
                	else {
                    System.out.println("예약을 취소했습니다.");
                    break; // 예약 취소
                }
            }
        }
    }
}

