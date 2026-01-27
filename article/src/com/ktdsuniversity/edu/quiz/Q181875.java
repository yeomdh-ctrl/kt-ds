package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q181875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();              // 문자열 개수
        String[] strArr = new String[N];   // 배열 생성
        
        // 문자열 입력
        for (int i = 0; i < N; i++) {
            strArr[i] = sc.nextLine();
        }
        
        // 조건에 맞게 변환
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {  // 짝수 인덱스 → 소문자
                strArr[i] = strArr[i].toLowerCase();
            } else {           // 홀수 인덱스 → 대문자
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        
        // 출력
        for (int i = 0; i < N; i++) {
            System.out.println(strArr[i]);
        }
    }
}

