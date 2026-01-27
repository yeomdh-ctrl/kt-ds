package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q181875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = sc.nextLine().split("");  // 한 줄 전체 입력

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(strArr[i].toLowerCase() + " ");
            } else {
                System.out.print(strArr[i].toUpperCase() + " ");
            }
        }
    }
}




