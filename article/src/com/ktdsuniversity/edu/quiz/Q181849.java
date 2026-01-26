package com.ktdsuniversity.edu.quiz;

import java.util.Scanner;

public class Q181849 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num_str = sc.next();  // 문자열 입력
        int sum = 0;

        for (String s : num_str.split("")) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}

