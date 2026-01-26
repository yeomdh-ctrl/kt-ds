package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q181847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();  // 문자열 입력
        
        int idx = 0;

        // 처음 0이 아닌 위치 찾기
        while (idx < str.length() && str.charAt(idx) == '0') {
            idx++;
        }

        // 결과 출력
        if (idx == str.length()) {
            System.out.println("0");   // 전부 0일 때
        } else {
            System.out.println(str.substring(idx));
        }
    }
}

