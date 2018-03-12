package com.javaex.practice02;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int [] num = new int[5];
        double sum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }
        System.out.println("평균은 " + sum/num.length + " 입니다.");
    }
}
