package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q181875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();          // 문자열 개수
        String[] strArr = new String[N];

        for (int i = 0; i < N; i++) {  // 문자열 입력
            strArr[i] = sc.next();
        }

        for (int i = 0; i < N; i++) {  // 변환 + 출력
            if (i % 2 == 0) {
                System.out.print(strArr[i].toLowerCase() + " ");
            } else {
                System.out.print(strArr[i].toUpperCase() + " ");
            }
        }
    }
}



