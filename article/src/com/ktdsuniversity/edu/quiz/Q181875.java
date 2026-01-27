package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q181875 {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스 → 소문자
                strArr[i] = strArr[i].toLowerCase();
            } else {
                // 홀수 인덱스 → 대문자
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
}


