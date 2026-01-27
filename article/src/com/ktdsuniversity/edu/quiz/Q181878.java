package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q181878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String myString = sc.nextLine();
        String pat = sc.nextLine();
        
        // 대소문자 구분 없애기
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if (myString.contains(pat)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

